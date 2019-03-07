package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import com.espe.edu.gestionPagos.model.Contrato;

public interface ContratoService {
	
	Contrato save(Contrato contrato);
	
	List<Contrato> findAll();
	Optional<Contrato> findbyId(long idContrato);
	
	void deleteContrato(long idContrato);

}
