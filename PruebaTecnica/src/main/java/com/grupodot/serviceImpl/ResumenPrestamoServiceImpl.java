package com.grupodot.serviceImpl;

import org.springframework.stereotype.Service;

import com.grupodot.dto.ResumenPrestamo;
import com.grupodot.entities.Prestamo;
import com.grupodot.service.ResumenPrestamoService;

@Service
public class ResumenPrestamoServiceImpl implements ResumenPrestamoService{

	@Override
	public ResumenPrestamo obtenerResumen(Prestamo prestamo, float valor) {
		if( prestamo == null ) return null;
		float pagoTotal = redondear(valor * ( 1 + ( (prestamo.getTasaInteres()/100) * 36 )));
		float cuotaMensual = redondear(pagoTotal / 36);
		ResumenPrestamo resumen = new ResumenPrestamo();
		resumen.setCuotaMensual( cuotaMensual );
		resumen.setPagoTotal( pagoTotal );
		resumen.setSocio( prestamo.getSocio() );
		resumen.setTasaInteres( prestamo.getTasaInteres() );
		return resumen;
	}

	private float redondear(float f) {
		return (float) (Math.round(f * Math.pow(10, 2)) / Math.pow(10, 2));
	}
	
}
