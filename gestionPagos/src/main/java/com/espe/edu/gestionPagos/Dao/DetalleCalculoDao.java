package com.espe.edu.gestionPagos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.gestionPagos.model.DetalleCalculo;

public interface DetalleCalculoDao extends JpaRepository<DetalleCalculo , Long>{

	
	
	@SuppressWarnings("unchecked")
	DetalleCalculo save(DetalleCalculo gestionDetalleCalculo);
}
