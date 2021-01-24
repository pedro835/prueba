package com.grupodot.controller;

import java.util.List;
import java.util.Optional;

import com.grupodot.entities.Prestamo;

public interface PrestamoController {
	
	public List<Prestamo> getprestamos();
	
	public Optional<Prestamo> getPrestamoById(Long id);

}
