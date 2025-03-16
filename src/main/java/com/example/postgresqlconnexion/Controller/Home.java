package com.example.postgresqlconnexion.Controller;

import com.example.postgresqlconnexion.Model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {
    @GetMapping
    public String home() {
        return "Bienvenue sur mon application Spring Boot !";
    }
}
