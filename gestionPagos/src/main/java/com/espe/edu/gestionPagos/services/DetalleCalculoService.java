package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import com.espe.edu.gestionPagos.model.DetalleCalculo;

public interface DetalleCalculoService {

	DetalleCalculo save (DetalleCalculo detalleCalculo);
	
	List<DetalleCalculo> findAll();
	Optional<DetalleCalculo> findbyId (long numDet);
	
	void deleteDetalleCalculo(long numDet);
}
