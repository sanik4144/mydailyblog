package com.sanik.mydailyblog.Controllers;

import com.sanik.mydailyblog.Services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeleteController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/deleteBlog/{id}")
    public String deleteBlog(@PathVariable Long id){
        blogService.deleteBlog(id);
        return "redirect:/profilePage";
    }
}
