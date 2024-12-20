package org.launchcode.blog.controllers;

import jakarta.validation.Valid;
import org.launchcode.blog.models.Blog;
import org.launchcode.blog.models.Emotion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogController {

    final static List<Blog> blogContent = new ArrayList<>();

    @GetMapping
    public String index(){
        return "home";
    }

    @GetMapping("/new-post")
    public String newPostForm(Model model){
        model.addAttribute("blog", new Blog());
        model.addAttribute("emotions", Emotion.values());
        return "new-post";
    }

    @PostMapping("/new-post")
    public String handleNewPost(Model model, @ModelAttribute @Valid Blog blog, Errors errors){
        if(errors.hasErrors()){
            model.addAttribute("blog", blog);
            model.addAttribute("emotions", Emotion.values());
            return "new-post";
        }
        blogContent.add(blog);
        model.addAttribute("blog", blog);
        return "content";
    }

    @GetMapping("/posts")
    public String getAllPosts(Model model){
        model.addAttribute("posts", blogContent);
        return "posts";
    }
}
