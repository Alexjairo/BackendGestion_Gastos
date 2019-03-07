package com.espe.edu.gestionPagos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.gestionPagos.model.DatosEmpleado;

public interface DatosEmpleadoDao extends JpaRepository <DatosEmpleado , Long> {

	@SuppressWarnings("unchecked")
	DatosEmpleado save (DatosEmpleado gestionDatosEmpleado);
}
