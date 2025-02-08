package com.example.scm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")//it means when a user visits , on localhost:8081/home
    public String home(Model model){// then this method will start executing and sending data to html page.
        System.out.println("Home page Controller");
        //Sending data to view.
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("youtubeChannel", "Shivam Tamboli");
        model.addAttribute("githubRepo", "https://github.com/Shivam-tamboli/scm");
        return "home";//tell spring boot to show home.html .
    }



}
