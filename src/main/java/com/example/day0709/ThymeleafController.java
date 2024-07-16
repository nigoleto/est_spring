package com.example.day0709;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String index(@RequestParam("name") String name, Model model) {
        model.addAttribute("name1", name);
        return "index";
    }
}
