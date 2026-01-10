package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Added annotation
public class Viewcontroller {

    @GetMapping ({"/","/schholmanagement"})
    public String showHome(Model model) {
        return "home";   
    } 

    @GetMapping ({"/students"})
    public String Students(Model model) {
        return "students";   
    } 
    
    @GetMapping ({"/fees"})
    public String transactions(Model model) {
        return "fees";   
    } 
    
    @GetMapping ({"/classes"})
    public String classes(Model model) {
        return "classes";   
    } 

}
