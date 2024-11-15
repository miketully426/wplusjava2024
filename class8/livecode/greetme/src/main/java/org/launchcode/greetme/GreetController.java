package org.launchcode.greetme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetController {

    @ResponseBody
    @GetMapping
    public String index(){
        return "<h1>Hello, world!</h1>";
    }

    @ResponseBody
    @GetMapping("greet")
    public String greetForm(){
        String html = "<form method='post'>" +
                "<input type='text' name='name' />" +
                "<select name='lang'>" +
                "<option value='english'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value='tamil'>Tamil</option>" +
                "</select>" +
                "<button type='submit'>Submit</button>" +
                "</form>";
        return html;
    }

    @ResponseBody
    @PostMapping("greet")
    public String handleGreet(@RequestParam String name, @RequestParam String lang){
        String response;
        if(lang.equals("english")){
            response = "Hello, ";
        } else if (lang.equals("french")){
            response = "Bonjour, ";
        } else {
            response = "Vanakkam, ";
        }

        return "<h1>" + response + name + "</h1>";

    }
}
