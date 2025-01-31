package org.launchcode.blog.controllers;

import jakarta.validation.Valid;
import org.launchcode.blog.models.Blog;
import org.launchcode.blog.models.Emotion;
import org.launchcode.blog.repositories.BlogRepository;
import org.launchcode.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

//    final static List<Blog> blogContent = new ArrayList<>();
    @Autowired
    BlogRepository blogRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String index(){
        return "home";
    }

    @GetMapping("/new-post")
    public String newPostForm(Model model){
        model.addAttribute("blog", new Blog());
        model.addAttribute("emotions", Emotion.values());
        model.addAttribute("users", userRepository.findAll());
        return "new-post";
    }

    @PostMapping("/new-post")
    public String handleNewPost(Model model, @ModelAttribute @Valid Blog blog, Errors errors){
        if(errors.hasErrors()){
            model.addAttribute("blog", blog);
            model.addAttribute("emotions", Emotion.values());
            model.addAttribute("users", userRepository.findAll());
            return "new-post";
        }
//        blogContent.add(blog);
        blogRepository.save(blog);
        model.addAttribute("blog", blog);
        return "content";
    }

    @GetMapping("/posts")
    public String getAllPosts(Model model){
        model.addAttribute("posts", blogRepository.findAll());
        return "posts";
    }
}
