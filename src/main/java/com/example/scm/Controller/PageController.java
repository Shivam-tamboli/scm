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
        model.addAttribute("name", "SubString Technologies" );
        model.addAttribute("email", "shivamt12345@gmail.com");
        model.addAttribute("password", 1234);
        model.addAttribute("Githubrepo", "https://github.com/Shivam-tamboli?tab=overview&from=2025-02-01&to=2025-02-07");
        return "home";//tell spring boot to show home.html .
    }
}
