package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.gestionPagos.Dao.ProveedorDao;
import com.espe.edu.gestionPagos.model.Proveedor;

@Service
public class ProveedorServiceImplement implements ProveedorService {

	@Autowired
	protected ProveedorDao proveedorDao;
	
	
	@Override
	public Proveedor save(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return this.proveedorDao.save(proveedor);
	}

	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return this.proveedorDao.findAll();
	}

	@Override
	public Optional<Proveedor> findbyId(long proRuc) {
		// TODO Auto-generated method stub
		return this.proveedorDao.findById(proRuc);
	}

	@Override
	public void deleteProveedor(long proRuc) {
		this.proveedorDao.deleteById(proRuc);
		
	}

}
