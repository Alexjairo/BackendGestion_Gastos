package com.vseg.reserva.services;

import java.util.List;
import java.util.Optional;


import com.vseg.reserva.model.Reserva;

public interface ReservaService {

	Reserva save(Reserva reserva);

	List<Reserva> findAll();
	Optional<Reserva> findbyId(long resId);
	void deleteReserva(long resId);

	


}
