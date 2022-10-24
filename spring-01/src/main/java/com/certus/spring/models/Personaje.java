package com.certus.spring.models;

public class Personaje {
    private String nombres;
    private String alias;
    private String TipoFruta;
    private String Habilidad;
    private String tripulacion;
    private String Recompensa;
    
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getTipoFruta() {
		return TipoFruta;
	}
	public void setTipoFruta(String tipoFruta) {
		TipoFruta = tipoFruta;
	}
	public String getHabilidad() {
		return Habilidad;
	}
	public void setHabilidad(String habilidad) {
		Habilidad = habilidad;
	}
	public String getTripulacion() {
		return tripulacion;
	}
	public void setTripulacion(String tripulacion) {
		this.tripulacion = tripulacion;
	}
	public String getRecompensa() {
		return Recompensa;
	}
	public void setRecompensa(String recompensa) {
		Recompensa = recompensa;
	}
    
    
}
