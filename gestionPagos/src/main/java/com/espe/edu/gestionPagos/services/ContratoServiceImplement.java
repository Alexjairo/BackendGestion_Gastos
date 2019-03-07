package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.gestionPagos.Dao.ContratoDao;
import com.espe.edu.gestionPagos.model.Contrato;

@Service 
public class ContratoServiceImplement implements ContratoService {

	
	@Autowired
	protected ContratoDao contratoDao;
	
	
	@Override
	public Contrato save(Contrato contrato) {
		// TODO Auto-generated method stub
		return this.contratoDao.save(contrato);
	}

	@Override
	public List<Contrato> findAll() {
		// TODO Auto-generated method stub
		return this.contratoDao.findAll();
	}

	@Override
	public Optional<Contrato> findbyId(long idContrato) {
		// TODO Auto-generated method stub
		return this.contratoDao.findById(idContrato);
	}

	@Override
	public void deleteContrato(long idContrato) {
		this.contratoDao.deleteById(idContrato);
		
	}
	
	

}
