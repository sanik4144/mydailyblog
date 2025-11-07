package com.sanik.mydailyblog.Controllers;

import com.sanik.mydailyblog.Entities.Blog;
import com.sanik.mydailyblog.Services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Controller
public class UpdateController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/editBlog/{id}")
    public String editBlog(@PathVariable("id") Long id, Model model){
        Blog blog = blogService.getBlogById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Blog Not Found"));

        model.addAttribute("blog", blog);
        return "editBlog";
    }

    @PostMapping("/updateBlog/{id}")
    public String updateBlog(@ModelAttribute Blog blog, @PathVariable("id") Long id){
        blogService.updateBlog(blog, id);

        return "redirect:/profilePage";
    }
}
