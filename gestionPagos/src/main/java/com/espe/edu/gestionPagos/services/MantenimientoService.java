package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import com.espe.edu.gestionPagos.model.Mantenimiento;

public interface MantenimientoService {

	Mantenimiento save (Mantenimiento mantenimiento);
	
	List<Mantenimiento> findAll();
	Optional<Mantenimiento> findbyId(long numMant);
	
	void deleteMantenimiento(long numMant);
}
