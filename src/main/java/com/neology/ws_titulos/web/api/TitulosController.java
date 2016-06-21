package com.neology.ws_titulos.web.api;

import java.util.Date;

import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neology.ws_titulos.dtos.TitulosDto;
import com.neology.ws_titulos.model.Identificaciones;
import com.neology.ws_titulos.model.Titulos;
import com.neology.ws_titulos.repository.IdentificacionesRepository;
import com.neology.ws_titulos.repository.TitulosRepository;
import com.neology.ws_titulos.response.BaseResponse;
import com.neology.ws_titulos.response.IdentificacionesResponse;
import com.neology.ws_titulos.response.TitulosResponse;

@RestController
@RequestMapping("/api")
public class TitulosController {
	
	@Autowired
	TitulosRepository titulosRepository;
	
	@Autowired
	IdentificacionesRepository identificacionesRepository;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
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
	
	@RequestMapping(value="/insertData", method = RequestMethod.POST)
	public BaseResponse insertarTitulado(@RequestBody TitulosDto titulosDto) {
		Titulos t =  titulosRepository.findByIntNumeroIdentificacion(titulosDto.getIntNumeroIdentificacion());
		BaseResponse baseResponse = new BaseResponse();
		if(t==null) {
			Titulos titulos = new Titulos();
			titulos.setIntNumeroIdentificacion(titulosDto.getIntNumeroIdentificacion());
			titulos.setStrNombre(titulosDto.getStrNombre());
			titulos.setStrApePaterno(titulosDto.getStrApePaterno());
			titulos.setStrApeMaterno(titulosDto.getStrApeMaterno());
			titulos.setStrTitulo(titulosDto.getStrTitulo());
			titulos.setStrCarrera(titulosDto.getStrCarrera());
			titulos.setStrNivel(titulosDto.getStrNivel());
			titulos.setIntNumFolioDocumento(titulosDto.getIntNumFolioDocumento());
			titulos.setStrNacionalidad(titulosDto.getStrNacionalidad());
			titulos.setdFechaNac(new Date(titulosDto.getdFechaNac()));
			titulos.setbFirmaTitulado(decodeImage(titulosDto.getbFirmaTitulado()));
			titulos.setbFotoOriginal(decodeImage(titulosDto.getbFotoOriginal()));
			titulos.setbFotoMiniatura(decodeImage(titulosDto.getbFirmaTitulado()));
			titulos.setStrNombreUniversidad(titulosDto.getStrNombreUniversidad());
			titulos.setIntClaveUniversidad(titulosDto.getIntClaveUniversidad());
			titulos.setdFechaExpedicion(new Date(titulosDto.getdFechaExpedicion()));
			titulos.setGenero(titulosDto.getGenero());
			baseResponse.setCode(200);
			baseResponse.setMsj("Datos insertados en DB correctamente");
			titulosRepository.save(titulos);
		} else {
			baseResponse.setCode(400);
			baseResponse.setMsj("Los datos del titulado que se desean insertar ya existen");
		}		
		return baseResponse;
	}
	
	@RequestMapping(
			value="/identificacion", 
			params = { "folioIdentificacion" }, 
			method = RequestMethod.GET)
	public IdentificacionesResponse getDataIdentification(
			@RequestParam(value = "folioIdentificacion") int folioIdentificacion) {
		Identificaciones identificaciones = new Identificaciones();
		identificaciones =  identificacionesRepository.findByFolioIdentificacion(folioIdentificacion);
		IdentificacionesResponse c = new IdentificacionesResponse();
		if (identificaciones!=null) {			
			c.setIdentificaciones(identificaciones);
			c.setMsg("Identificacion Encontrada");
			c.setCode(200);
		} else {
			c.setMsg("Identificacion No Encontrada");
			c.setCode(400);
			c.setIdentificaciones(identificaciones);
		}
		return c;
	}	
	
	public static byte[] decodeImage(String imageDataString) {
        return Base64.decodeBase64(imageDataString);
    }
}
