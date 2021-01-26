package com.grupodot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestParam;

import com.grupodot.dto.ResumenPrestamo;
import com.grupodot.entities.Prestamo;

public interface PrestamoController {
	
	public List<Prestamo> getprestamos();
	
	public Optional<Prestamo> getPrestamoById(Long id);
	
	public ResumenPrestamo obtenerPrestamo(@RequestParam(name="valor") Float value );
	
	public String test();

}
