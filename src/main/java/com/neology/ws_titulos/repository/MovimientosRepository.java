package com.neology.ws_titulos.repository;

import org.springframework.data.repository.CrudRepository;

import com.neology.ws_titulos.model.AutosSoat;
import com.neology.ws_titulos.model.MovimientosParki;
import com.neology.ws_titulos.model.TipoAutoSoat;
import com.neology.ws_titulos.model.Titulos;

public interface MovimientosRepository extends CrudRepository<MovimientosParki, Integer>{
	MovimientosParki findByStrTarjetaID(String strTarjetaID);
}
