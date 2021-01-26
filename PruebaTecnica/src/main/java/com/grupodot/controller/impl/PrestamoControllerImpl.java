package com.grupodot.controller.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupodot.controller.PrestamoController;
import com.grupodot.dto.ResumenPrestamo;
import com.grupodot.entities.Prestamo;
import com.grupodot.service.PrestamoService;
import com.grupodot.service.ResumenPrestamoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PrestamoControllerImpl implements PrestamoController {
	
	@Autowired		
	PrestamoService prestamoService;
	
	@Autowired
	ResumenPrestamoService resumenPrestamoService;

	@Override
	@RequestMapping(value="/prestamo", method = RequestMethod.GET, produces = "application/json")
	public List<Prestamo> getprestamos() {
		return prestamoService.findAllPrestamos();
	}

	@Override
	@RequestMapping(value="/prestamo/{id}", method = RequestMethod.GET, produces = "text/plain")
	public Optional<Prestamo> getPrestamoById(Long id) {
		return prestamoService.findPrestamoById(id);
	}
	
	@Override
	@RequestMapping( value = "/prestamo/obtenerPrestamo" , method = RequestMethod.GET, produces = "application/json")
	public ResumenPrestamo obtenerPrestamo(@RequestParam(name="valor") Float value ){
	      Prestamo p = prestamoService.obtenerPrestamo(value);
	      ResumenPrestamo r = resumenPrestamoService.obtenerResumen(p, value);
	      return r;
	 }
	
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "text/plain")
	@Override
	public String test() {
	    return "Test done";
	}
}

	