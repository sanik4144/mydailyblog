package com.sanik.mydailyblog.Controllers;
import com.sanik.mydailyblog.Entities.User;
import com.sanik.mydailyblog.Services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LogInController {
    @Autowired
    private UserService userService;

    @GetMapping("/loginPage")
    public String goToLoginPage(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/loginUser")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password,
                            HttpSession session,
                            Model model,
                            @ModelAttribute("user") User user){

        User validUser = userService.logInUser(email, password);

        if (validUser != null){
            session.setAttribute("loggedUser", validUser);
            return "redirect:/profilePage";
        }
        else{
            model.addAttribute("errorMsg", "Invalid Email or Password");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logOut(HttpSession session){
        session.invalidate();
        return "redirect:/loginPage";
    }
}
