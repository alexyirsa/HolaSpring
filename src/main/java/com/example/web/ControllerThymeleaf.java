package com.example.web;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.domain.Individuo;


@Controller
@Slf4j
public class ControllerThymeleaf {

    @GetMapping("/")    
    public String inicio(Model model){
    

        log.info("Estoy ejecutando el controlador MVC"); 
        //model.addAttribute("individuos", individuos);
        return "indice";
    }
    
}
