package com.vseg.reserva.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vseg.reserva.dao.ReservaDao;
import com.vseg.reserva.model.Reserva;

@Service
public class ReservaServiceImplement implements ReservaService {

	@Autowired
	protected  ReservaDao reservaDao;
	
	@Override
	public Reserva save(Reserva reserva) {
		return this.reservaDao.save(reserva);
		
	}
	
	@Override
	public List<Reserva> findAll() {
		return this.reservaDao.findAll();
	}
	
	@Override
	public Optional<Reserva> findbyId(long resId) {
		return this.reservaDao.findById(resId);
	}
	@Override
	public void deleteReserva(long resId) {
		this.reservaDao.deleteById(resId);	
	}
}
