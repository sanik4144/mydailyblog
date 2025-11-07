package com.sanik.mydailyblog.Controllers;

import com.sanik.mydailyblog.Entities.Blog;
import com.sanik.mydailyblog.Entities.User;
import com.sanik.mydailyblog.Services.BlogService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProfileController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/profilePage")
    public String profilePage(Model model, HttpSession session) {
        User user = (User) session.getAttribute("loggedUser");

        if(user == null){
            model.addAttribute("user", new User());
            model.addAttribute("loginMsg", "You have to login First");
            return "login";
        }

        model.addAttribute("userName", user.getName());
        model.addAttribute("userEmail", user.getEmail());

        List<Blog> blogs = blogService.showAllBlogs();
        model.addAttribute("blogs", blogs);

        model.addAttribute("blog", new Blog());

        return "profile";
    }
}
