package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.gestionPagos.Dao.CertificadoPresupuestarioDao;
import com.espe.edu.gestionPagos.model.CertificadoPresupuestario;

@Service
public class CertificadoPresupuestarioServiceImplement implements CertificadoPresupuestarioService {

	
	@Autowired
	protected CertificadoPresupuestarioDao certificadoPresupuestarioDao;
	
	
	
	@Override
	public CertificadoPresupuestario save(CertificadoPresupuestario certificadoPresupuestario) {
		
		return this.certificadoPresupuestarioDao.save(certificadoPresupuestario);
	}

	@Override
	public List<CertificadoPresupuestario> findAll() {
		
		return this.certificadoPresupuestarioDao.findAll();
	}

	@Override
	public Optional<CertificadoPresupuestario> findbyId(long certId) {
	
		return this.certificadoPresupuestarioDao.findById(certId);
	}

	@Override
	public void deleteCertificadoPresupuestario(long certId) {
		
		this.certificadoPresupuestarioDao.deleteById(certId);
		
	}
	
	
	

}
