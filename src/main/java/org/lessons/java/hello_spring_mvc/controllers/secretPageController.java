package org.lessons.java.hello_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class secretPageController {

    @GetMapping("/secretPage")
    public String secretPage() {
        return "secretPage";
    }

}
