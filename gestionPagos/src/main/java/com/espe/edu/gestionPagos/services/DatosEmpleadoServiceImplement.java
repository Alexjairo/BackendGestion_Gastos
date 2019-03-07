package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.gestionPagos.Dao.DatosEmpleadoDao;
import com.espe.edu.gestionPagos.model.DatosEmpleado;

@Service
public class DatosEmpleadoServiceImplement implements DatosEmpleadoService {

	@Autowired
	protected DatosEmpleadoDao datosEmpleadoDao;
	
	
	
	@Override
	public DatosEmpleado save(DatosEmpleado datosEmpleado) {
		// TODO Auto-generated method stub
		return this.datosEmpleadoDao.save(datosEmpleado);
	}

	@Override
	public List<DatosEmpleado> findAll() {
		// TODO Auto-generated method stub
		return this.datosEmpleadoDao.findAll();
	}

	@Override
	public Optional<DatosEmpleado> findbyId(long tempCi) {
		// TODO Auto-generated method stub
		return this.datosEmpleadoDao.findById(tempCi);
	}

	@Override
	public void deleteDatosEmpleado(long tempCi) {
		this.datosEmpleadoDao.deleteById(tempCi);
		
	}

}
