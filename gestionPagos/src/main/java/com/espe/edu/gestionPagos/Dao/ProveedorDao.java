package com.espe.edu.gestionPagos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.gestionPagos.model.Proveedor;

public interface ProveedorDao extends JpaRepository<Proveedor , Long>{

@SuppressWarnings("unchecked")
Proveedor save(Proveedor gestionProveedor);
	
	
}
