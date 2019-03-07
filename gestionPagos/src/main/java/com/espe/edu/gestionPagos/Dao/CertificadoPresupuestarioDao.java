package com.espe.edu.gestionPagos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.gestionPagos.model.CertificadoPresupuestario;




public interface CertificadoPresupuestarioDao extends JpaRepository<CertificadoPresupuestario, Long> {
	
@SuppressWarnings("unchecked")


CertificadoPresupuestario save(CertificadoPresupuestario gestionCertificadoPresupuestario );

}
