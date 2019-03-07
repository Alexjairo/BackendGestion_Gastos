package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.gestionPagos.Dao.OrdenGastosDao;
import com.espe.edu.gestionPagos.model.OrdenGastos;

@Service
public class OrdenGastosServiceImplement implements OrdenGastosService{

	@Autowired
	protected OrdenGastosDao ordenGastosDao;
	
	
	@Override
	public OrdenGastos save(OrdenGastos ordenGastos) {
		// TODO Auto-generated method stub
		return this.ordenGastosDao.save(ordenGastos);
	}

	@Override
	public List<OrdenGastos> findAll() {
		// TODO Auto-generated method stub
		return this.ordenGastosDao.findAll();
	}

	@Override
	public Optional<OrdenGastos> findbyId(long numOrden) {
		// TODO Auto-generated method stub
		return this.ordenGastosDao.findById(numOrden);
	}

	@Override
	public void deleteOrdenGastos(long numOrden) {
		this.ordenGastosDao.deleteById(numOrden);
		
	}

}
