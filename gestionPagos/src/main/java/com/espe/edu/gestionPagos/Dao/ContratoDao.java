package com.espe.edu.gestionPagos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.gestionPagos.model.Contrato;

public interface ContratoDao extends JpaRepository<Contrato, Long> {

	@SuppressWarnings("unchecked")
	
	Contrato save (Contrato gestionContrato);
}
