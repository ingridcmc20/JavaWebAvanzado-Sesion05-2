package com.tecsup.shopping.modelo;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

public class Usuario {
	String id;
	@NotEmpty
	String cuenta;
	@NotEmpty
	String clave;
	@Range(min = 1, max = 100)
	Integer edad = 0;
	String direccion;
	boolean suscripcionRevista;
	String[] favoritoFrameworks;
	String genero;
	String favoritoNumero;
	String pais;
	String[] habilidades;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isSuscripcionRevista() {
		return suscripcionRevista;
	}

	public void setSuscripcionRevista(boolean suscripcionRevista) {
		this.suscripcionRevista = suscripcionRevista;
	}

	public String[] getFavoritoFrameworks() {
		return favoritoFrameworks;
	}

	public void setFavoritoFrameworks(String[] favoritoFrameworks) {
		this.favoritoFrameworks = favoritoFrameworks;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFavoritoNumero() {
		return favoritoNumero;
	}

	public void setFavoritoNumero(String favoritoNumero) {
		this.favoritoNumero = favoritoNumero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String[] habilidades) {
		this.habilidades = habilidades;
	}
}
