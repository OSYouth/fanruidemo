package com.tianbiaoge.example.fanruidemo.controller;

import com.tianbiaoge.example.fanruidemo.Repository.UserRepository;
import com.tianbiaoge.example.fanruidemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Describe 以前为了写demo测试的控制类
 */
@Controller
public class HelloController {
//
//    @Value("${cupSize}")
//    private String cupSize;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(){
        return "/login";
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> userList(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/users")
    public User userAdd(@RequestParam("userName") String userName,
                          @RequestParam("password") String password){
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        return userRepository.save(user);
    }
}
