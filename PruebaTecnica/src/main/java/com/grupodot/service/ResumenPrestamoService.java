package com.grupodot.service;

import com.grupodot.dto.ResumenPrestamo;
import com.grupodot.entities.Prestamo;

public interface ResumenPrestamoService {

	public ResumenPrestamo obtenerResumen( Prestamo prestamo, float valor );
	
}
