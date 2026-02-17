package com.example.prueba_java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HolaMundo {
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("mensaje", "¡Hola Mundo!");
        model.addAttribute("submensaje", "Bienvenido a mi aplicación Spring Boot con Java 21");
        
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        model.addAttribute("fecha", ahora.format(formatter));
        
        return "index";
    }
    
    @GetMapping("/info")
    public String info(Model model) {
        model.addAttribute("javaVersion", System.getProperty("java.version"));
        model.addAttribute("osName", System.getProperty("os.name"));
        model.addAttribute("osVersion", System.getProperty("os.version"));
        model.addAttribute("userName", System.getProperty("user.name"));
        
        return "info";
    }
}
