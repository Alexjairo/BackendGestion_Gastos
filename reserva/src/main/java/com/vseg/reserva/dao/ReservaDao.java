package com.vseg.reserva.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


import com.vseg.reserva.model.Reserva;

public interface ReservaDao extends JpaRepository<Reserva, Long> {
/*
	@Query("select d from Reserva d where d.id = :resId")
	List<Reserva> findByDestinoIdReturnStream(@Param("resId") Long resId);
	*/


	@SuppressWarnings("unchecked")
Reserva save (Reserva reserva);
	

}
