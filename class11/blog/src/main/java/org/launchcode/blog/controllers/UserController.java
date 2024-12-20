package org.launchcode.blog.controllers;

import jakarta.validation.Valid;
import org.launchcode.blog.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private List<User> users = new ArrayList<>();

    @GetMapping
    public String displayUserForm(Model model){
        model.addAttribute("user", new User());
        return "user/signup";
    }

    @PostMapping
    public String handleUserForm(Model model, @ModelAttribute @Valid User user, Errors errors) {
        if(errors.hasErrors()){
            model.addAttribute("user", user);
            return "user/signup";
        }
        users.add(user);
        model.addAttribute("users", users);
        return "user/list";
    }
}
