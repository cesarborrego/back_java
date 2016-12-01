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

import com.neology.ws_titulos.dtos.AutosSoatDTO;
import com.neology.ws_titulos.dtos.TitulosDto;
import com.neology.ws_titulos.model.AutosSoat;
import com.neology.ws_titulos.model.CedulasNeology;
import com.neology.ws_titulos.model.Engomados;
import com.neology.ws_titulos.model.Identificaciones;
import com.neology.ws_titulos.model.Licencias_Peru;
import com.neology.ws_titulos.model.Titulos;
import com.neology.ws_titulos.repository.AutosSoatRepository;
import com.neology.ws_titulos.repository.CedulasNeoRepository;
import com.neology.ws_titulos.repository.EngomadosRepository;
import com.neology.ws_titulos.repository.IdentificacionesRepository;
import com.neology.ws_titulos.repository.LicenciasPeruRepository;
import com.neology.ws_titulos.repository.TitulosRepository;
import com.neology.ws_titulos.response.AutosSoatResponse;
import com.neology.ws_titulos.response.BaseResponse;
import com.neology.ws_titulos.response.CedulasNeoResponse;
import com.neology.ws_titulos.response.EngomadoResponse;
import com.neology.ws_titulos.response.IdentificacionesResponse;
import com.neology.ws_titulos.response.LicenciasPeruResponse;
import com.neology.ws_titulos.response.TitulosResponse;

@RestController
@RequestMapping("/api")
public class TitulosController {
	
	@Autowired
	TitulosRepository titulosRepository;
	
	@Autowired
	IdentificacionesRepository identificacionesRepository;
	
	@Autowired
	EngomadosRepository engomadosRepository;
	
	@Autowired
	LicenciasPeruRepository licenciasPeruRepository;
	
	@Autowired
	AutosSoatRepository autosSoatRepository;
	
	@Autowired
	CedulasNeoRepository cedulasNeoRepository;
	
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
	
	@RequestMapping(
			value="/titulo", 
			params = { "icn" }, 
			method = RequestMethod.GET)
	public TitulosResponse getDataTituloIcn(
			@RequestParam(value = "icn") String icn) {
		Titulos titulos = new Titulos();
		titulos =  titulosRepository.findByIcn(icn);
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
			titulos.setIcn(titulosDto.getIcn());
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
	
	@RequestMapping(
			value="/engomado", 
			params = { "placa" }, 
			method = RequestMethod.GET)
	public EngomadoResponse getDataEngomado(
			@RequestParam(value = "placa") String placa) {
		Engomados engomados = new Engomados();
		engomados = engomadosRepository.findByPlaca(placa);
		EngomadoResponse c = new EngomadoResponse();
		if (engomados!=null) {			
			c.setEngomados(engomados);
			c.setMsg("Placa Encontrada");
			c.setCode(200);
		} else {
			c.setMsg("Placa No Encontrada");
			c.setCode(400);
			c.setEngomados(engomados);
		}
		return c;
	}
	
	@RequestMapping(
			value="/licencia_peru", 
			params = { "strNoLicencia" }, 
			method = RequestMethod.GET)
	public LicenciasPeruResponse getLicencia(
			@RequestParam(value = "strNoLicencia") String strNoLicencia) {
		Licencias_Peru licencias_Peru = new Licencias_Peru();
		licencias_Peru =  licenciasPeruRepository.findByStrNoLicencia(strNoLicencia);
		LicenciasPeruResponse c = new LicenciasPeruResponse();
		if (licencias_Peru!=null) {			
			c.setLicencias_Peru(licencias_Peru);
			c.setMsg("Licencia Encontrada");
			c.setCode(200);
		} else {
			c.setMsg("Licencia No Encontrada");
			c.setCode(400);
			c.setLicencias_Peru(licencias_Peru);
		}
		return c;
	}	
	
	@RequestMapping(
			value="/autos_soat",
			params={"strFolio"},
			method = RequestMethod.GET)
	public AutosSoatResponse getAuto(@RequestParam(value = "strFolio") String strFolio) {
		AutosSoat autosSoat = new AutosSoat();
		autosSoat = autosSoatRepository.findByStrFolio(strFolio);
		AutosSoatResponse autosSoatResponse = new AutosSoatResponse();
		if( autosSoat!=null) {
			autosSoatResponse.setMsg("Vehículo encontrado");
			autosSoatResponse.setCode(200);
			autosSoatResponse.setAutosSoat(autosSoat);
		} else {
			autosSoatResponse.setMsg("Vehículo No Encontrado");
			autosSoatResponse.setCode(400);
			autosSoatResponse.setAutosSoat(autosSoat);
		}
		return autosSoatResponse;
	}
	
	@RequestMapping(value="/insertNewDateAutosSoat", 
			method = RequestMethod.POST)
	public BaseResponse insertNewDateAutoSoat(@RequestBody AutosSoatDTO autosSoatDTO) {
		AutosSoat autosSoat =  autosSoatRepository.findByStrFolio(autosSoatDTO.getStrFolio());
		BaseResponse baseResponse = new BaseResponse();
		if(autosSoat!=null) {
			autosSoat.setDtmFechaExpiracion(autosSoatDTO.getDtmFechaExpiracion());
			baseResponse.setCode(200);
			baseResponse.setMsj("Fecha "+autosSoatDTO.getDtmFechaExpiracion()+" actualizada en DB correctamente");
			autosSoatRepository.save(autosSoat);
		}		
		return baseResponse;
	}
	
	@RequestMapping(
			value="/cedulaNeo",
			params={"intNoCedula"},
			method = RequestMethod.GET)
	public CedulasNeoResponse getCedula(@RequestParam(value = "intNoCedula") String intNoCedula) {
		CedulasNeology cedulasNeology = new CedulasNeology();
		cedulasNeology = cedulasNeoRepository.findOne(Long.parseLong(intNoCedula));
		CedulasNeoResponse cedulasNeoResponse = new CedulasNeoResponse();
		if( cedulasNeology!=null) {
			cedulasNeoResponse.setMsg("Cédula encontrada");
			cedulasNeoResponse.setCode(200);
			cedulasNeoResponse.setCedulasNeology(cedulasNeology);
		} else {
			cedulasNeoResponse.setMsg("Cédula No Encontrada");
			cedulasNeoResponse.setCode(400);
			cedulasNeoResponse.setCedulasNeology(cedulasNeology);
		}
		return cedulasNeoResponse;
	}
	
	public static byte[] decodeImage(String imageDataString) {
        return Base64.decodeBase64(imageDataString);
    }
}
