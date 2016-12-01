package com.neology.ws_titulos.repository;

import org.springframework.data.repository.CrudRepository;

import com.neology.ws_titulos.model.AutosSoat;
import com.neology.ws_titulos.model.TipoAutoSoat;

public interface AutosSoatRepository extends CrudRepository<AutosSoat, Integer>{
	AutosSoat findByStrFolio(String strFolio);
}
