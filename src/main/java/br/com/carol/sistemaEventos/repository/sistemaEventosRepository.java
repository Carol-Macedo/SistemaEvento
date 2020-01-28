package br.com.carol.sistemaEventos.repository;

import br.com.carol.sistemaEventos.model.sistemaEventosModel;
import org.springframework.data.repository.CrudRepository;

public interface sistemaEventosRepository  extends CrudRepository<sistemaEventosModel, String> {

}
