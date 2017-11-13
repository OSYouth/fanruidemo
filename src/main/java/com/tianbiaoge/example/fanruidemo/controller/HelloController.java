package com.tianbiaoge.example.fanruidemo.controller;

import com.tianbiaoge.example.fanruidemo.UserRepository;
import com.tianbiaoge.example.fanruidemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
