package com.example.scm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page Controller");
        model.addAttribute("name", "SubString Technologies" );
        model.addAttribute("email", "shivamt12345@gmail.com");
        model.addAttribute("password", 1234);
        return "home";
    }
}
