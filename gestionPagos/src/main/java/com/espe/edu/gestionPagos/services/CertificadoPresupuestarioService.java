package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import com.espe.edu.gestionPagos.model.CertificadoPresupuestario;

public interface CertificadoPresupuestarioService {

	CertificadoPresupuestario save (CertificadoPresupuestario certificadoPresupuestario);

	List<CertificadoPresupuestario> findAll();
	Optional<CertificadoPresupuestario> findbyId(long certId);
	
	void deleteCertificadoPresupuestario(long certId);


}
