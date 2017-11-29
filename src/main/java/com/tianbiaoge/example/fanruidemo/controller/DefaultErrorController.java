package com.tianbiaoge.example.fanruidemo.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Describe 默认的错误处理
 * @auther LC
 * @create 2017/11/29
 */
@Controller
public class DefaultErrorController implements ErrorController {
    private static final String ERROR_PATH = "/error";
    @RequestMapping(value=ERROR_PATH)
    public String handleError(){
        return "/error";
    }
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
