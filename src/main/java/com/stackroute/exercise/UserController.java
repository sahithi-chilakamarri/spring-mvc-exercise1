package com.stackroute.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
//Handler method which is used to handle all the requests ending with / 
    @RequestMapping("/")
    public String greet(Model model){
        //Creating object for the user
        User user = new User("sahithi");
        //Adding attribute to the view
        model.addAttribute("message",user.getMessage());
        //Returning view
        return "index";
    }
}


