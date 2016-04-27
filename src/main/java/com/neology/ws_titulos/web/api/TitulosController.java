package com.neology.ws_titulos.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neology.ws_titulos.model.Titulos;
import com.neology.ws_titulos.repository.TitulosRepository;
import com.neology.ws_titulos.response.TitulosResponse;

@RestController
@RequestMapping("/api")
public class TitulosController {
	
	@Autowired
	TitulosRepository titulosRepository;
	
	@RequestMapping(
			value="/titulo", 
			params = { "intNumeroIdentificacion" }, 
			method = RequestMethod.GET)
	public TitulosResponse getDataTitulo(
			@RequestParam(value = "intNumeroIdentificacion") int intNumeroIdentificacion) {
		Titulos titulos = new Titulos();
		titulos =  titulosRepository.findByIntNumeroIdentificacion(intNumeroIdentificacion);
		TitulosResponse c = new TitulosResponse();
		if (titulos!=null) {			
			c.setTitulos(titulos);
			c.setMsj("Titulado Encontrado");
			c.setCode(200);
		} else {
			c.setMsj("Titulado No Encontrado");
			c.setCode(400);
			c.setTitulos(titulos);
		}
		return c;
	}	
}
