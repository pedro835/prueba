package com.grupodot.service;

import java.util.List;
import java.util.Optional;


import com.grupodot.entities.Prestamo;

public interface PrestamoService {
	
	public List<Prestamo> findAllPrestamos();
	
	public Optional<Prestamo> findPrestamoById(Long id);
	
	public Prestamo obtenerPrestamo(Float value );

}
