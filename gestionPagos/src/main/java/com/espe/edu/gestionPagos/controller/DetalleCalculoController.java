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

import com.espe.edu.gestionPagos.model.DetalleCalculo;
import com.espe.edu.gestionPagos.services.DetalleCalculoService;
import com.espe.edu.gestionPagosConstants.Constantes;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins= {Constantes.DOMAIN1})
@RestController
@RequestMapping("/gestionPagos")
public class DetalleCalculoController {

	@Autowired
	private DetalleCalculoService detalleCalculoService;
	private ObjectMapper mapper;
	

@SuppressWarnings("rawtypes")
@RequestMapping(value = "/saveOrUpdate/detalleCalculo", method = RequestMethod.POST)
public ResponseEntity saveOrUpdate(@RequestBody String detalleCalculoJson)
		throws JsonParseException, JsonMappingException, IOException {

	DetalleCalculo detalleCalculo = new DetalleCalculo();
	this.mapper = new ObjectMapper();
	try {
		detalleCalculo = this.mapper.readValue(detalleCalculoJson, DetalleCalculo.class);
		System.out.println(detalleCalculo);
		
		if (!this.validate(detalleCalculo)) {
			System.out.println("if");
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
		this.detalleCalculoService.save(detalleCalculo);
		System.out.println("save");
		return new ResponseEntity(HttpStatus.OK);
	} catch (Exception e) {
		System.out.println(e);
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}



@RequestMapping(value = "/getDetalleCalculo", method = RequestMethod.GET)
/* METODO BUSCAR */
public List<DetalleCalculo> getDetalleCalculo() {
	return this.detalleCalculoService.findAll();
}

@RequestMapping(value = "/deleteDetalleCalculo", method = RequestMethod.POST)
public void deleteDetalleCalculo(@RequestBody String detalleCalculoJson) throws Exception {
	this.mapper = new ObjectMapper();
	DetalleCalculo detalleCalculo = this.mapper.readValue(detalleCalculoJson, DetalleCalculo.class);
	if (detalleCalculo.getNumDet() == 0L) {
		throw new Exception("El Id esta nulo");
	}
	this.detalleCalculoService.deleteDetalleCalculo(detalleCalculo.getNumDet());
}
private boolean validate(DetalleCalculo detalleCalculo) {
	// TODO Auto-generated method stub
	return false;
}

}


