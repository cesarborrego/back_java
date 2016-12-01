package com.neology.ws_titulos.repository;

import org.springframework.data.repository.CrudRepository;

import com.neology.ws_titulos.model.Titulos;

public interface TitulosRepository extends CrudRepository<Titulos, Integer> {
	Titulos findByIntNumeroIdentificacion(int intNumeroIdentificacion);
	Titulos findByIcn(String icn);
}
