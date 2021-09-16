package com.example.propperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Profile("Perfil1")
public class Perfil1 implements Perfiles{

    String perfil = "Perfil1";

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
