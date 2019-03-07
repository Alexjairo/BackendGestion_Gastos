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

import com.espe.edu.gestionPagos.model.DatosEmpleado;
import com.espe.edu.gestionPagos.services.DatosEmpleadoService;
import com.espe.edu.gestionPagosConstants.Constantes;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins= {Constantes.DOMAIN1})
@RestController
@RequestMapping("/gestionPagos")
public class DatosEmpleadoController {

	
	@Autowired
	private DatosEmpleadoService datosEmpleadoService;
	private ObjectMapper mapper;
	

@SuppressWarnings("rawtypes")
@RequestMapping(value = "/saveOrUpdateDatosEmpleado", method = RequestMethod.POST)
public ResponseEntity saveOrUpdate(@RequestBody String datosEmpleadoJson)
		throws JsonParseException, JsonMappingException, IOException {

	DatosEmpleado datosEmpleado = new DatosEmpleado();
	this.mapper = new ObjectMapper();
	try {
		datosEmpleado = this.mapper.readValue(datosEmpleadoJson, DatosEmpleado.class);
		System.out.println(datosEmpleado);
		
		if (!this.validate(datosEmpleado)) {
			System.out.println("if");
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
		this.datosEmpleadoService.save(datosEmpleado);
		System.out.println("save");
		return new ResponseEntity(HttpStatus.OK);
	} catch (Exception e) {
		System.out.println(e);
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

@RequestMapping(value = "/getDatosEmpleado", method = RequestMethod.GET)
/* METODO BUSCAR */
public List<DatosEmpleado> getDatosEmpleados() {
	return this.datosEmpleadoService.findAll();
}

@RequestMapping(value = "/deleteDatosEmpleado", method = RequestMethod.POST)
public void deleteDatosEmpleados(@RequestBody String datosEmpleadoJson) throws Exception {
	this.mapper = new ObjectMapper();
	DatosEmpleado datosEmpleado = this.mapper.readValue(datosEmpleadoJson, DatosEmpleado.class);
	if (datosEmpleado.getTempCi() == 0L) {
		throw new Exception("El Id esta nulo");
	}
	this.datosEmpleadoService.deleteDatosEmpleado(datosEmpleado.getTempCi());
}

private boolean validate(DatosEmpleado datosEmpleado) {
	boolean isValid = true;

	if (datosEmpleado.getDatempNombre() == "" || datosEmpleado.getDatempNombre() == null) {
		isValid = false;
	}
	return isValid;
}

}

