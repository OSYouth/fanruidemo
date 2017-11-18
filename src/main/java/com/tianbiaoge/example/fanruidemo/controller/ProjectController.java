package com.tianbiaoge.example.fanruidemo.controller;

import com.tianbiaoge.example.fanruidemo.Repository.IProjectRepository;
import com.tianbiaoge.example.fanruidemo.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/project")
public class ProjectController {
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
    //在list页面点击项目获得项目设计编号，读取该项目的具体内容并跳转到detail页面
    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public String projectDetail(@RequestParam("idProject") String idProject,
                                Model model){
        Project project = iProjectRepository.findByIdProject(idProject);
        //应该有一个添加成功的提示
        return "redirect:/project/detail";
    }
}
