package com.neology.ws_titulos.repository;

import org.springframework.data.repository.CrudRepository;

import com.neology.ws_titulos.model.Licencias_Peru;

public interface LicenciasPeruRepository extends CrudRepository<Licencias_Peru, String>{
	Licencias_Peru findByStrNoLicencia(String strNoLicencia);

}
