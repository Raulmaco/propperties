package com.example.propperties;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class propiedades {

    @Autowired
    Perfiles perfil;

    @Value("${url: no hay url}")
    String url;

    @Value("${password: no hay password}")
    String passw;

    @Value("${VAR3:var3 no tiene valor}")
    String var3;

    @GetMapping("/parametros")
    public String leerProperties(){
        return ("La url es " +url +" y la constraseña es " +passw);
    }

    @GetMapping("/perfil")
    public String mostrarPerfil(){
        return ("El perfil en uso es: " +perfil.getPerfil());
    }

    @Bean
    public void leerPropertiesAlEmpezar(){
        System.out.println("La url es " +url +" y la constraseña es " +passw);
    }
}
