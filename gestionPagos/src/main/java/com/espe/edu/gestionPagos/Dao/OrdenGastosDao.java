package com.espe.edu.gestionPagos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.gestionPagos.model.OrdenGastos;

public interface OrdenGastosDao extends JpaRepository<OrdenGastos, Long> {

@SuppressWarnings("unchecked")
OrdenGastos save(OrdenGastos gestionOrdenGastos);
}
