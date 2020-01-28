package br.com.carol.sistemaEventos.service;

import br.com.carol.sistemaEventos.model.sistemaEventosModel;
import br.com.carol.sistemaEventos.repository.sistemaEventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class sistemaEventosService {

    @Autowired
    private sistemaEventosRepository repository;

    public sistemaEventosModel cadastrarEvento(sistemaEventosModel Eventos){
        Eventos.setAtivo(Boolean.TRUE);

        Eventos.setDataCriacao(LocalDate.now());
        return repository.save(Eventos);
    }

}
