package com.espe.edu.gestionPagos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.gestionPagos.model.Mantenimiento;

public interface MantenimientoDao extends JpaRepository<Mantenimiento, Long>{
@SuppressWarnings("unchecked")
Mantenimiento save (Mantenimiento gestionMantenimiento);
}
