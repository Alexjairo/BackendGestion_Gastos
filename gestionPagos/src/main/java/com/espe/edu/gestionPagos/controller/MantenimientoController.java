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

import com.espe.edu.gestionPagos.model.Mantenimiento;
import com.espe.edu.gestionPagos.services.MantenimientoService;
import com.espe.edu.gestionPagosConstants.Constantes;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins= {Constantes.DOMAIN1})
@RestController
@RequestMapping("/gestionPagos")
public class MantenimientoController {

	
	
	@Autowired
	private MantenimientoService mantenimientoService;
	private ObjectMapper mapper;
	


@SuppressWarnings("rawtypes")
@RequestMapping(value = "/saveOrUpdate/mantenimiento", method = RequestMethod.POST)
public ResponseEntity saveOrUpdate(@RequestBody String mantenimientoJson)
		throws JsonParseException, JsonMappingException, IOException {

	Mantenimiento mantenimiento = new Mantenimiento();
	this.mapper = new ObjectMapper();
	try {
		mantenimiento = this.mapper.readValue(mantenimientoJson, Mantenimiento.class);
		System.out.println(mantenimiento);
		
		if (!this.validate(mantenimiento)) {
			System.out.println("if");
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
		this.mantenimientoService.save(mantenimiento);
		System.out.println("save");
		return new ResponseEntity(HttpStatus.OK);
	} catch (Exception e) {
		System.out.println(e);
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}



@RequestMapping(value = "/getMantenimiento", method = RequestMethod.GET)
/* METODO BUSCAR */
public List<Mantenimiento> getMantenimiento() {
	return this.mantenimientoService.findAll();
}

@RequestMapping(value = "/deleteMantenimiento", method = RequestMethod.POST)
public void deleteMantenimiento(@RequestBody String mantenimientoJson) throws Exception {
	this.mapper = new ObjectMapper();
	Mantenimiento mantenimiento = this.mapper.readValue(mantenimientoJson, Mantenimiento.class);
	if (mantenimiento.getNumMant() == 0L) {
		throw new Exception("El Id desta nulo");
	}
	this.mantenimientoService.deleteMantenimiento(mantenimiento.getNumMant());
}

private boolean validate(Mantenimiento mantenimiento) {
	boolean isValid = true;

	if (mantenimiento.getMantInfo() == "" || mantenimiento.getMantInfo() == null) {
		isValid = false;
	}
	return isValid;
}


	
}
