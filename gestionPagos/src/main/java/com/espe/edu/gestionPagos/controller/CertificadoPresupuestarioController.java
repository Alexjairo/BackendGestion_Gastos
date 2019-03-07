package com.espe.edu.gestionPagos.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.espe.edu.gestionPagos.model.CertificadoPresupuestario;
import com.espe.edu.gestionPagos.services.CertificadoPresupuestarioService;
import com.espe.edu.gestionPagosConstants.Constantes;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = {Constantes.DOMAIN1})
@RestController
@RequestMapping("/gestionPagos")
public class CertificadoPresupuestarioController {
	
	
@Autowired
private CertificadoPresupuestarioService certificadoPresupuestarioService;
private ObjectMapper mapper ;



@SuppressWarnings("rawtypes")
@RequestMapping(value = "/saveOrUpdate/Certificado", method = RequestMethod.POST)
public ResponseEntity saveOrUpdate(@RequestBody String certificadoPresupuestarioJson)
		throws JsonParseException, JsonMappingException, IOException {

	CertificadoPresupuestario certificadoPresupuestario = new CertificadoPresupuestario();
	this.mapper = new ObjectMapper();
	try {
		certificadoPresupuestario = this.mapper.readValue(certificadoPresupuestarioJson, CertificadoPresupuestario.class);
		System.out.println(certificadoPresupuestario);
		
		if (!this.validate(certificadoPresupuestario)) {
			System.out.println("if");
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
		this.certificadoPresupuestarioService.save(certificadoPresupuestario);
		System.out.println("save");
		return new ResponseEntity(HttpStatus.OK);
	} catch (Exception e) {
		System.out.println(e);
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

@RequestMapping(value = "/getCertificado", method = RequestMethod.GET)
/* METODO BUSCAR */
public List<CertificadoPresupuestario> getDestinos() {
	return this.certificadoPresupuestarioService.findAll();
}

@RequestMapping(value = "/deleteCertificado", method = RequestMethod.POST)
public void deleteDestino(@RequestBody String certificadoPresupuestarioJson) throws Exception {
	this.mapper = new ObjectMapper();
	CertificadoPresupuestario certificadoPresupuestario = this.mapper.readValue(certificadoPresupuestarioJson, CertificadoPresupuestario.class);
	if (certificadoPresupuestario.getCertId() == 0L) {
		throw new Exception("El Id esta nulo");
	}
	this.certificadoPresupuestarioService.deleteCertificadoPresupuestario(certificadoPresupuestario.getCertId());
}

private boolean validate(CertificadoPresupuestario certificadoPresupuestario) {
	boolean isValid = true;

	if (certificadoPresupuestario.getObjeto() == "" || certificadoPresupuestario.getObjeto() == null) {
		isValid = false;
	}
	return isValid;
}
}
