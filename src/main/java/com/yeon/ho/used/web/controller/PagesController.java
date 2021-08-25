package com.yeon.ho.used.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

//    @GetMapping("/pages/index")
//    public String indexPage() {
//        return "pages/index";
//    }

    @GetMapping("/pages/profile-details")
    public String profileDetailsPage() {
        return "pages/profile-details";
    }

}
