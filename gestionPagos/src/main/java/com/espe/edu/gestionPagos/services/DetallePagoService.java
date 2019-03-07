package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import com.espe.edu.gestionPagos.model.DetallePago;

public interface DetallePagoService {
	
	DetallePago save (DetallePago detallePago);
	
	List<DetallePago> findAll();
	Optional<DetallePago> findbyId (long depaDetId);
	
	void deleteDetallePago(long depaDetId );

}
