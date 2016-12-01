package com.neology.ws_titulos.repository;

import org.springframework.data.repository.CrudRepository;

import com.neology.ws_titulos.model.Engomados;

public interface EngomadosRepository extends CrudRepository<Engomados, String>{
	Engomados findByPlaca(String placa);
}
