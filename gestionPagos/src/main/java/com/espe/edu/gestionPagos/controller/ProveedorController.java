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

import com.espe.edu.gestionPagos.model.Proveedor;
import com.espe.edu.gestionPagos.services.ProveedorService;
import com.espe.edu.gestionPagosConstants.Constantes;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins= {Constantes.DOMAIN1})
@RestController
@RequestMapping("/gestionPagos")
public class ProveedorController {


	@Autowired
	private ProveedorService proveedorService;
	private ObjectMapper mapper;
	
	

@SuppressWarnings("rawtypes")
@RequestMapping(value = "/saveOrUpdate/proveedor", method = RequestMethod.POST)
public ResponseEntity saveOrUpdate(@RequestBody String proveedorJson)
		throws JsonParseException, JsonMappingException, IOException {

	Proveedor proveedor = new Proveedor();
	this.mapper = new ObjectMapper();
	try {
		proveedor = this.mapper.readValue(proveedorJson,Proveedor.class);
		System.out.println(proveedor);
		
		if (!this.validate(proveedor)) {
			System.out.println("if");
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
		this.proveedorService.save(proveedor);
		System.out.println("save");
		return new ResponseEntity(HttpStatus.OK);
	} catch (Exception e) {
		System.out.println(e);
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}



@RequestMapping(value = "/getProveedor", method = RequestMethod.GET)
/* METODO BUSCAR */
public List<Proveedor> getProveedor() {
	return this.proveedorService.findAll();
}

@RequestMapping(value = "/deleteProveedor", method = RequestMethod.POST)
public void deleteProveedor(@RequestBody String proveedorJson) throws Exception {
	this.mapper = new ObjectMapper();
	Proveedor proveedor = this.mapper.readValue(proveedorJson, Proveedor.class);
	if (proveedor.getProRuc() == 0L) {
		throw new Exception("El Id desta nulo");
	}
	this.proveedorService.deleteProveedor(proveedor.getProRuc());
}

private boolean validate(Proveedor proveedor) {
	boolean isValid = true;

	if (proveedor.getProNombre() == "" || proveedor.getProNombre() == null) {
		isValid = false;
	}
	return isValid;
}


	
}



