package com.devlomose.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/","/index"})
    public String index(){
        System.out.println("layout");
        return "index";
    }

    @GetMapping("/oups")
    public String errorPage(){
        return "notimplemented";
    }
}
