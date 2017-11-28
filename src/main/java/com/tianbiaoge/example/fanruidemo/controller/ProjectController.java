package com.tianbiaoge.example.fanruidemo.controller;

import com.tianbiaoge.example.fanruidemo.Repository.IProjectRepository;
import com.tianbiaoge.example.fanruidemo.constant.ExceptionConstant;
import com.tianbiaoge.example.fanruidemo.domain.Project;
import com.tianbiaoge.example.fanruidemo.domain.Result;
import com.tianbiaoge.example.fanruidemo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/project")
public class ProjectController {
    @Autowired
    private IProjectRepository iProjectRepository;

    @Autowired
    public ProjectController(IProjectRepository iProjectRepository){
        this.iProjectRepository = iProjectRepository;
    }
    //子栏目“项目”，点击后给出全部的项目清单，页面有添加新项目，通过关键字查找等功能
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String projectList(Model model){
        List<Project> projectList = iProjectRepository.findAll();
        if(projectList != null){
            model.addAttribute("allProjects", projectList);
        }
        return "/list";
    }

    /**
     * @Describe 跳转到addnew.html页面
     * @return
     */
    @GetMapping(value = "/add")
    public String add(){
        return "/addnew";
    }


    //查询设计名称中的部分关键字跳转或者说是刷新该页面
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String projectSearchList(@RequestParam("designName") String designName,
                                    Model model){
        List<Project> projectResultList = iProjectRepository.findByDesignName(designName);
        if(projectResultList != null){
            model.addAttribute("resultProjects", projectResultList);
        }
        return "redirect:/project/list";
    }
    //添加新项目的页面，通过在list的“添加”按钮跳转到此页面
    @RequestMapping(value = "/addnew", method = RequestMethod.POST)
    public String addNewProject(Project project){
        iProjectRepository.save(project);
        //应该有一个添加成功的提示
        return "redirect:/project/detail";
    }

    @PostMapping("/save")
    @ResponseBody
    public Result save(@Valid Project project, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(ExceptionConstant.ERROR_CODE, ExceptionConstant.ERROR);
        } else {
            ;
            return ResultUtil.success(this.iProjectRepository.save(project));
        }

    }



    //在list页面点击项目获得项目设计编号，读取该项目的具体内容并跳转到detail页面
    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public String projectDetail(@RequestParam("idProject") String idProject,
                                Model model){
        Project project = iProjectRepository.findByIdProject(idProject);
        //应该有一个添加成功的提示
        return "redirect:/project/detail";
    }

    /**
     * @Describe 跳转到详情页面
     * @param idProject
     * @param model
     * @return
     */
    @GetMapping(value = "/viewDetail/{id}")
    public String viewDetail(@PathVariable("id") String  idProject,  Model model){

        Project project = iProjectRepository.findByIdProject(idProject);
        model.addAttribute("projectDetail",project);
        return "/detail";

    }
}
