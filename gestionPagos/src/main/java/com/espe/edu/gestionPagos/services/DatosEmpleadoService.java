package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import com.espe.edu.gestionPagos.model.DatosEmpleado;

public interface DatosEmpleadoService {

	DatosEmpleado save (DatosEmpleado datosEmpleado);
	
	List<DatosEmpleado> findAll();
	Optional<DatosEmpleado> findbyId(long tempCi);
	
	void deleteDatosEmpleado(long tempCi);
}
