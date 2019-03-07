package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import com.espe.edu.gestionPagos.model.Proveedor;

public interface ProveedorService {
	
	Proveedor save (Proveedor proveedor);
	
	List<Proveedor> findAll();
	Optional<Proveedor> findbyId(long proRuc);
	
	void deleteProveedor(long proRuc);

}
