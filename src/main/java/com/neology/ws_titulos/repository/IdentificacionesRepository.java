package com.neology.ws_titulos.repository;

import org.springframework.data.repository.CrudRepository;

import com.neology.ws_titulos.model.Identificaciones;

public interface IdentificacionesRepository extends CrudRepository<Identificaciones, Integer>{
	Identificaciones findByFolioIdentificacion(int folioIdentificacion);
}
