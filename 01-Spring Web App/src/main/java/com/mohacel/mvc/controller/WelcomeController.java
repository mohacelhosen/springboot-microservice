package com.mohacel.mvc.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public ModelAndView great(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "Welcome the world of MVC");
        mav.setViewName("index");
        return mav;
    }

}
