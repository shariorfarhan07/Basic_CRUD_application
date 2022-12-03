package com.test.testProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String handleTest(){
        return "<h1>Hi stalker<h1>";
    }

    @RequestMapping("/")
    public String handleTest2(){
        return "home";
    }
}
