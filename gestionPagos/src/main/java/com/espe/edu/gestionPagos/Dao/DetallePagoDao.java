package com.espe.edu.gestionPagos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.gestionPagos.model.DetallePago;

public interface DetallePagoDao extends JpaRepository<DetallePago , Long>{

	@SuppressWarnings("unchecked")
	DetallePago save (DetallePago gestionDetallePago);
}
