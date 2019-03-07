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

import com.espe.edu.gestionPagos.model.Contrato;
import com.espe.edu.gestionPagos.services.ContratoService;
import com.espe.edu.gestionPagosConstants.Constantes;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins= {Constantes.DOMAIN1})
@RestController
@RequestMapping("/gestionPagos")
public class ContratoController {
	
	@Autowired
	private ContratoService contratoService;
	private ObjectMapper mapper;
	

@SuppressWarnings("rawtypes")
@RequestMapping(value = "/saveOrUpdate/Contrato", method = RequestMethod.POST)
public ResponseEntity saveOrUpdate(@RequestBody String contratoJson)
		throws JsonParseException, JsonMappingException, IOException {

	Contrato contrato = new Contrato();
	this.mapper = new ObjectMapper();
	try {
		contrato = this.mapper.readValue(contratoJson, Contrato.class);
		System.out.println(contrato);
		
		if (!this.validate(contrato)) {
			System.out.println("if");
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
		this.contratoService.save(contrato);
		System.out.println("save");
		return new ResponseEntity(HttpStatus.OK);
	} catch (Exception e) {
		System.out.println(e);
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

@RequestMapping(value = "/getContrato", method = RequestMethod.GET)
/* METODO BUSCAR */
public List<Contrato> getContrato() {
	return this.contratoService.findAll();
}

@RequestMapping(value = "/deleteContrato", method = RequestMethod.POST)
public void deleteContrato(@RequestBody String contratoJson) throws Exception {
	this.mapper = new ObjectMapper();
	Contrato contrato = this.mapper.readValue(contratoJson, Contrato.class);
	if (contrato.getIdContrato() == 0L) {
		throw new Exception("El Id esta nulo");
	}
	this.contratoService.deleteContrato(contrato.getIdContrato());
}

private boolean validate(Contrato contrato) {
	boolean isValid = true;

	if (contrato.getTipCont() == "" || contrato.getTipCont() == null) {
		isValid = false;
	}
	return isValid;
}

}
