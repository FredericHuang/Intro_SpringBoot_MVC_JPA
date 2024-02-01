package fr.devance.tp_springboot_mvc_jpa.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    public Controller() {
    }

    @RequestMapping("/")
    public String getTemp(Model model){
        model.addAttribute("name","capteur de température");
        return "template1";
    }
}