package com.example.propperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Profile("Perfil2")
public class Perfil2 implements Perfiles{

    String perfil = "Perfil2";


    @Override
    public void miFuncion() {

    }

    @GetMapping("/perfil")
    public String mostrarPerfil(){
        return ("El perfil en uso es: " +perfil);
    }
    @Override
    public String getPerfil() {
        return this.perfil;
    }
}
