package com.himanshu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Himanshu on 05-09-2016.
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello(ModelMap modelMap){
        modelMap.addAttribute("greeting", "Hello Spring mvc");

        return "/resources/hello.html";
    }

}
