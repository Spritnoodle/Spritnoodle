package edu.zut.cs.javaee.log.main.web.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/index")
    public String index() {
        return "main/index";
    }

}
