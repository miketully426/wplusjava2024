package org.launchcode.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BlogController {

    final static Map<String, String> blogContent = new HashMap<>();

    @GetMapping
    public String index(){
        return "home";
    }

    @GetMapping("/new-post")
    public String newPostForm(){
        return "new-post";
    }

    @PostMapping("/new-post")
    public String handleNewPost(Model model, @RequestParam String title, @RequestParam String content){
        blogContent.put(title, content);
        model.addAttribute("title", title);
        model.addAttribute("content", content);
        return "content";
    }

    @GetMapping("/posts")
    public String getAllPosts(Model model){
        model.addAttribute("posts", blogContent);
        return "posts";
    }
}
