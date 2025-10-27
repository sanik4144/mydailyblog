package com.sanik.mydailyblog.Controllers;

import com.sanik.mydailyblog.Entities.User;
import com.sanik.mydailyblog.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/regPage")
   public String getRegister(Model model){
       model.addAttribute("user", new User());
       return "register";
   }
   @PostMapping("/postReg")
   public String postRegister(@ModelAttribute("user") User user, Model model){
        boolean status = userService.registerUser(user);

        if(status){
            model.addAttribute("successMsg", "Registration Successful. You Can Log In Now");
            return "login";
        }
        else {
            model.addAttribute("failMsg", "Registration Failed. Please Try Again");
            return "register";
        }
   }

   @GetMapping("/loginPage")
   public String login(){
        return "login";
   }
}
