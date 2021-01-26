package com.grupodot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prestamo")
public class Prestamo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private long id;
	
	@Column(name="socio")
	public String socio;
	
	@Column(name="tasa_interes")
	private float tasaInteres;
	
	@Column(name="monto_max_dispo")
	private double montoMaxDispo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSocio() {
		return socio;
	}

	public void setSocio(String socio) {
		this.socio = socio;
	}

	public float getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(float tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public double getMontoMaxDispo() {
		return montoMaxDispo;
	}

	public void setMontoMaxDispo(double montoMaxDispo) {
		this.montoMaxDispo = montoMaxDispo;
	}

	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", socio=" + socio + ", tasaInteres=" + tasaInteres + ", montoMaxDispo="
				+ montoMaxDispo + "]";
	}
	
	
	
}
