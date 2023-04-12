package com.ashish.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        System.out.println("Home");
        return "welcome";
    }

    @RequestMapping("/aboutus")
    public String aboutUs(){
        System.out.println("About Us");
        return "aboutus";
    }

    @RequestMapping("/services")
    public String services(){
        System.out.println("Services");
        return "services";
    }
}
