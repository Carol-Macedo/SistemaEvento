package br.com.carol.sistemaEventos.controller;

import br.com.carol.sistemaEventos.model.sistemaEventosModel;
import br.com.carol.sistemaEventos.service.sistemaEventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class sistemaEventosController{

    @Autowired
    private sistemaEventosService service;

    @GetMapping
    public String mostrarHome(){
        return "index";
    }

    @PostMapping("/cadastrar")
    public String cadastrarEvento(sistemaEventosModel eventos){
        service.cadastrarEvento(eventos);
        return "index";
    }
}
