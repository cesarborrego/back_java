package com.neology.ws_titulos.repository;

import org.springframework.data.repository.CrudRepository;

import com.neology.ws_titulos.model.Parquimetros;
import com.neology.ws_titulos.model.Titulos;

public interface ParquimetrosRepository extends CrudRepository<Parquimetros, Integer> {
	Parquimetros findByStrTarjetaID(String strTarjetaID);
}
