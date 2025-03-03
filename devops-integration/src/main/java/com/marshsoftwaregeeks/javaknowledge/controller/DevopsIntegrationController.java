package com.marshsoftwaregeeks.javaknowledge.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsIntegrationController {

    @GetMapping("/devopsIntegration")

    public String getData(){

        return "Welcome to DevopsIntegration project of marshsotwaregeeks";
    }
}
