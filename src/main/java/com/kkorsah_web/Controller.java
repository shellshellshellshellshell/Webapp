package com.kkorsah_web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class Controller {

    @RequestMapping("/hello")
    public String helloController() {
        return "<h1>Hello World!</h1>";
    }

    @RequestMapping("/fasion")
    public String fasionController() {
        return "<h1> Creative Clothing Designs <link rel=\"stylesheet\" href=\"indexStyle.css\"> </h1>";
    }
    

}
