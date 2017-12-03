package com.tianbiaoge.example.fanruidemo.controller;

import com.tianbiaoge.example.fanruidemo.Repository.ICompanyAccountRepository;
import com.tianbiaoge.example.fanruidemo.Repository.IHangUpRepository;
import com.tianbiaoge.example.fanruidemo.Repository.IProjectRepository;
import com.tianbiaoge.example.fanruidemo.Repository.UserRepository;
import com.tianbiaoge.example.fanruidemo.constant.ExceptionConstant;
import com.tianbiaoge.example.fanruidemo.domain.Project;
import com.tianbiaoge.example.fanruidemo.domain.Result;
import com.tianbiaoge.example.fanruidemo.domain.User;
import com.tianbiaoge.example.fanruidemo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public AdminController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String userList(Model model){
        List<User> userList = userRepository.findAll();
        if(userList != null){
            model.addAttribute("allUsers", userList);
        }
        return "/admin";
    }

    @PostMapping("/saveUser")
    @ResponseBody
    public Result saveProject(@Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(ExceptionConstant.ERROR_CODE, ExceptionConstant.ERROR);
        } else {
            ;
            return ResultUtil.success(this.userRepository.save(user));
        }
    }
}
