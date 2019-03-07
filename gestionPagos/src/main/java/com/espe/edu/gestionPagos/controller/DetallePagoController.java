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

import com.espe.edu.gestionPagos.model.DetallePago;
import com.espe.edu.gestionPagos.services.DetallePagoService;
import com.espe.edu.gestionPagosConstants.Constantes;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins= {Constantes.DOMAIN1})
@RestController
@RequestMapping("/gestionPagos")
public class DetallePagoController {

	

	@Autowired
	private DetallePagoService detallePagoService;
	private ObjectMapper mapper;
	
	

@SuppressWarnings("rawtypes")
@RequestMapping(value = "/saveOrUpdate/detallePago", method = RequestMethod.POST)
public ResponseEntity saveOrUpdate(@RequestBody String detallePagoJson)
		throws JsonParseException, JsonMappingException, IOException {

	DetallePago detallePago = new DetallePago();
	this.mapper = new ObjectMapper();
	try {
		detallePago = this.mapper.readValue(detallePagoJson, DetallePago.class);
		System.out.println(detallePago);
		
		if (!this.validate(detallePago)) {
			System.out.println("if");
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
		this.detallePagoService.save(detallePago);
		System.out.println("save");
		return new ResponseEntity(HttpStatus.OK);
	} catch (Exception e) {
		System.out.println(e);
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}



@RequestMapping(value = "/getDetallePago", method = RequestMethod.GET)
/* METODO BUSCAR */
public List<DetallePago> getDetallePago() {
	return this.detallePagoService.findAll();
}

@RequestMapping(value = "/deleteDetallePago", method = RequestMethod.POST)
public void deleteDetalleCalculo(@RequestBody String detallePagoJson) throws Exception {
	this.mapper = new ObjectMapper();
	DetallePago detallePago = this.mapper.readValue(detallePagoJson, DetallePago.class);
	if (detallePago.getDepaId() == 0L) {
		throw new Exception("El Id desta nulo");
	}
	this.detallePagoService.deleteDetallePago(detallePago.getDepaId());
}

private boolean validate(DetallePago detallePago) {
	boolean isValid = true;

	if (detallePago.getDepOrden() == "" || detallePago.getDepOrden() == null) {
		isValid = false;
	}
	return isValid;
}

}