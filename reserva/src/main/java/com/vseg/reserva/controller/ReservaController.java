package com.vseg.reserva.controller;

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

import com.vseg.reserva.model.Reserva;
import com.vseg.reserva.services.ReservaService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/vueloSeguro")
@CrossOrigin(origins = "http://localhost:4200")
public class ReservaController {
	@Autowired
	private ReservaService ReservaService;
	private ObjectMapper mapper;

	

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/saveOrUpdateReserva", method = RequestMethod.POST)
	public ResponseEntity saveOrUpdate(@RequestBody String reservaJson)
			throws JsonParseException, JsonMappingException, IOException {

		Reserva reserva = new Reserva();
		this.mapper = new ObjectMapper();
		try {
			reserva = this.mapper.readValue(reservaJson, Reserva.class);
			System.out.println(reserva);
			
			if (!this.validate(reserva)) {
				System.out.println("if");
				return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
			}
			this.ReservaService.save(reserva);
			System.out.println("save");
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/getReserva", method = RequestMethod.GET)
	/* METODO BUSCAR */
	public List<Reserva> getReserva() {
		return this.ReservaService.findAll();
	}

	@RequestMapping(value = "/deleteReserva", method = RequestMethod.POST)
	public void deleteDestino(@RequestBody String reservaJson) throws Exception {
		this.mapper = new ObjectMapper();
		Reserva reserva = this.mapper.readValue(reservaJson, Reserva.class);
		if (reserva.getResId() == 0L) {
			throw new Exception("El Id esta nulo");
		}
		this.ReservaService.deleteReserva(reserva.getResId());
	}

	private boolean validate(Reserva reserva) {
		boolean isValid = true;

		if (reserva.getCodigo()== "" || reserva. getCodigo()== null) {
			isValid = false;
		}
		return isValid;
	}

}
