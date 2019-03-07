package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import com.espe.edu.gestionPagos.model.OrdenGastos;

public interface OrdenGastosService {

	OrdenGastos save (OrdenGastos ordenGastos);
	
	List<OrdenGastos> findAll();
	Optional<OrdenGastos> findbyId (long numOrden);
	
	void deleteOrdenGastos (long numOrden);
}
