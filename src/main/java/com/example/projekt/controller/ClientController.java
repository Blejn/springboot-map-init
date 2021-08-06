package com.example.projekt.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
    @RequestMapping("/home-page-client")
    public String homePageClient() {
        return "/home-page-client";
    }

    @RequestMapping("/show-institutions-client")
    public String institutionsClient() {
        return "/show-institutions-client";
    }

    @RequestMapping("/offers-client")
    public String offersClient() {
        return "/offers-client";
    }

    @RequestMapping("/contact-client")
    public String contactClient() {
        return "/contact-client";
    }
}