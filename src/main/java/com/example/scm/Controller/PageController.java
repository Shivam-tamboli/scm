package com.example.scm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

//about route

    @RequestMapping("/about")
   public String aboutPage(Model model){
        model.addAttribute("isLogin", true);
        System.out.println("About page Controller:");
        return "about";
   }



//services
    @RequestMapping("/services")
    public String servicesPage(Model model){
        System.out.println("Service are about to run");
        return "services";
    }

}
