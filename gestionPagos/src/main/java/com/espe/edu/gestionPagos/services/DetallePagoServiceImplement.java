package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.gestionPagos.Dao.DetallePagoDao;
import com.espe.edu.gestionPagos.model.DetallePago;

@Service
public class DetallePagoServiceImplement implements DetallePagoService {

	
	
	@Autowired
	protected DetallePagoDao detallePagoDao;
	
	@Override
	public DetallePago save(DetallePago detallePago) {
		// TODO Auto-generated method stub
		return this.detallePagoDao.save(detallePago);
	}

	@Override
	public List<DetallePago> findAll() {
		// TODO Auto-generated method stub
		return this.detallePagoDao.findAll();
	}

	@Override
	public Optional<DetallePago> findbyId(long depaDetId) {
		// TODO Auto-generated method stub
		return this.detallePagoDao.findById(depaDetId);
	}

	@Override
	public void deleteDetallePago(long depaDetId) {
		this.detallePagoDao.deleteById(depaDetId);
		
	}

}
