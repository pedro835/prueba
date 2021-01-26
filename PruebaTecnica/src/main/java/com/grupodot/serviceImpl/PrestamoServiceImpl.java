package com.grupodot.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupodot.entities.Prestamo;
import com.grupodot.repository.PrestamoRepositorio;
import com.grupodot.service.PrestamoService;

@Service
public class PrestamoServiceImpl implements PrestamoService {
	
	@Autowired		
	PrestamoRepositorio prestamoRepositorio;

	@Override
	public List<Prestamo> findAllPrestamos() {
		return prestamoRepositorio.findAll();
	}

	@Override
	public Optional<Prestamo> findPrestamoById(Long id) {
		return (Optional<Prestamo>) prestamoRepositorio.findById(id);
		
	}
	
	@Override
	public Prestamo obtenerPrestamo(Float value ){
	    Prestamo mayor = null;
	    for( Prestamo prestamo : prestamoRepositorio.findAll() ){
	    	if(mayor == null) {
	    		mayor = prestamo;
	    		
	    	}else if(prestamo.getMontoMaxDispo() >= value && prestamo.getTasaInteres() < mayor.getTasaInteres() ){
			        mayor = prestamo;
			    }
			}
	        return mayor;
	    	
	}

}
