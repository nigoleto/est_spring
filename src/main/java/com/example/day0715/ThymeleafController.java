package com.example.day0715;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class ThymeleafController {

//    @GetMapping("/index")
//    public String index(Model model) {
//        model.addAttribute("name", "안녕하세요 John입니다. 나이: ");
//        model.addAttribute("age", 18);
//        model.addAttribute("style","color:red;");
//        model.addAttribute("fontSize", "font-size: 94px;");
//        model.addAttribute("strong", "STRONG");
//        model.addAttribute("birthday", new Date());
//        return "index";
//    }


    @GetMapping("/index")
    public String index(Model model) {
        User max = new User("max", "max", "max@gmail.com", "01026333333", 44, true, new Date(), false);
        int[] iterData = {1, 2, 3, 4, 5};

        model.addAttribute("user", max);
        model.addAttribute("iterData", iterData);

        return "index";
    }

    @GetMapping("/index/2")
    public String index2(Model model) {
        return "index2";
    }

    @GetMapping("/index/3")
    public String index3(Model model) {
        return "index3";
    }

    @PostMapping("/users")
    public String users(@ModelAttribute User user) {
//        return "redirect:/index";

        System.out.println("user: " + user.getName());
        System.out.println("email: " + user.getEmail());

        return "index2";
    }
}
