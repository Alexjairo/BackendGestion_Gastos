package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.gestionPagos.Dao.DetalleCalculoDao;
import com.espe.edu.gestionPagos.model.DetalleCalculo;

@Service
public class DetalleCalculoServiceImplement implements DetalleCalculoService {

	@Autowired
	protected DetalleCalculoDao detalleCalculoDao;
	
	
	@Override
	public DetalleCalculo save(DetalleCalculo detalleCalculo) {
		// TODO Auto-generated method stub
		return this.detalleCalculoDao.save(detalleCalculo);
	}

	@Override
	public List<DetalleCalculo> findAll() {
		// TODO Auto-generated method stub
		return this.detalleCalculoDao.findAll();
	}

	@Override
	public Optional<DetalleCalculo> findbyId(long numDet) {
		// TODO Auto-generated method stub
		return this.detalleCalculoDao.findById(numDet);
	}

	@Override
	public void deleteDetalleCalculo(long numDet) {
		this.detalleCalculoDao.deleteById(numDet);
		
	}

}
