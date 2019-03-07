package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.gestionPagos.Dao.MantenimientoDao;
import com.espe.edu.gestionPagos.model.Mantenimiento;

@Service
public class MantenimientoServiceImplement implements MantenimientoService{

	@Autowired
	protected MantenimientoDao mantenimientoDao;
		
	
	@Override
	public Mantenimiento save(Mantenimiento mantenimiento) {
		// TODO Auto-generated method stub
		return this.mantenimientoDao.save(mantenimiento);
	}

	@Override
	public List<Mantenimiento> findAll() {
		// TODO Auto-generated method stub
		return this.mantenimientoDao.findAll();
	}

	@Override
	public Optional<Mantenimiento> findbyId(long numMant) {
		// TODO Auto-generated method stub
		return this.mantenimientoDao.findById(numMant);
	}
   @Override
   public void deleteMantenimiento(long numMant) {
	   this.mantenimientoDao.deleteById(numMant);
   }
	
}
