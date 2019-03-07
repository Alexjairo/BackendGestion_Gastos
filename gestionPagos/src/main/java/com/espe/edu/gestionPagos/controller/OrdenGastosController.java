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

import com.espe.edu.gestionPagos.model.OrdenGastos;
import com.espe.edu.gestionPagos.services.OrdenGastosService;
import com.espe.edu.gestionPagosConstants.Constantes;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins= {Constantes.DOMAIN1})
@RestController
@RequestMapping("/gestionPagos")
public class OrdenGastosController {
	
	
	@Autowired
	private OrdenGastosService ordenGastosService;
	private ObjectMapper mapper;
	
	

@SuppressWarnings("rawtypes")
@RequestMapping(value = "/saveOrUpdate/ordenGastos", method = RequestMethod.POST)
public ResponseEntity saveOrUpdate(@RequestBody String ordenGastosJson)
		throws JsonParseException, JsonMappingException, IOException {

	OrdenGastos ordenGastos = new OrdenGastos();
	this.mapper = new ObjectMapper();
	try {
		ordenGastos = this.mapper.readValue(ordenGastosJson,OrdenGastos.class);
		System.out.println(ordenGastos);
		
		if (!this.validate(ordenGastos)) {
			System.out.println("if");
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
		this.ordenGastosService.save(ordenGastos);
		System.out.println("save");
		return new ResponseEntity(HttpStatus.OK);
	} catch (Exception e) {
		System.out.println(e);
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}



@RequestMapping(value = "/getOrdenGastos", method = RequestMethod.GET)
/* METODO BUSCAR */
public List<OrdenGastos> getOrdenGastos() {
	return this.ordenGastosService.findAll();
}

@RequestMapping(value = "/deleteOrdenGastos", method = RequestMethod.POST)
public void deleteOrdenGastos(@RequestBody String ordenGastosJson) throws Exception {
	this.mapper = new ObjectMapper();
	OrdenGastos ordenGastos = this.mapper.readValue(ordenGastosJson, OrdenGastos.class);
	if (ordenGastos.getNumOrden() == 0L) {
		throw new Exception("El Id desta nulo");
	}
	this.ordenGastosService.deleteOrdenGastos(ordenGastos.getNumOrden());
}

private boolean validate(OrdenGastos ordenGastos) {
	boolean isValid = true;

	if (ordenGastos.getOrdgaContrato() == "" || ordenGastos.getOrdgaContrato() == null) {
		isValid = false;
	}
	return isValid;
}


	
}



