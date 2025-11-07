package com.sanik.mydailyblog.Controllers;

import com.sanik.mydailyblog.Entities.Blog;
import com.sanik.mydailyblog.Services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @PostMapping("/saveBlog")
    public String addBlog(@ModelAttribute("blog") Blog blog){
       blogService.addBlog(blog);

        return "redirect:/profilePage";
    }
}
