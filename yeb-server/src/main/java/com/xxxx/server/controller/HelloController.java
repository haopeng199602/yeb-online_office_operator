package com.xxxx.server.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }


    @GetMapping("/empolyee/basic/hello")
    public String hello2(){
        return "/empolyee/basic/hello";
    }

    @GetMapping("/empolyee/advanced/hello")
    public String hello3(){
        return "/empolyee/advanced/hello";
    }
}
