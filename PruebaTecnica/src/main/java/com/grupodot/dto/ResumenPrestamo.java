package com.grupodot.dto;

public class ResumenPrestamo {
	
	private String socio;
	private float cuotaMensual;
	private float pagoTotal;
	private float tasaInteres;
	public String getSocio() {
		return socio;
	}
	public void setSocio(String socio) {
		this.socio = socio;
	}
	public float getCuotaMensual() {
		return cuotaMensual;
	}
	public void setCuotaMensual(float cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}
	public float getPagoTotal() {
		return pagoTotal;
	}
	public void setPagoTotal(float pagoTotal) {
		this.pagoTotal = pagoTotal;
	}
	public float getTasaInteres() {
		return tasaInteres;
	}
	public void setTasaInteres(float tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

}
