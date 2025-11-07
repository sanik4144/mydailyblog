package com.sanik.mydailyblog.Services;

import com.sanik.mydailyblog.Entities.Blog;
import com.sanik.mydailyblog.Repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> showAllBlogs() {
        return blogRepository.findAll();
    }

    public boolean addBlog(Blog blog){
        try{
            blogRepository.save(blog);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public void deleteBlog(long id) {
        blogRepository.deleteById(id);
    }

    public Optional<Blog> getBlogById(Long id) {
        return blogRepository.findById(id);
    }

    public void updateBlog(Blog updatedBlog, Long id){
        Blog existingBlog = blogRepository.findById(id).orElse(null);

        if(existingBlog != null){
            existingBlog.setTitle(updatedBlog.getTitle());
            existingBlog.setDescription(updatedBlog.getDescription());
            blogRepository.save(existingBlog);
        }
    }
}
