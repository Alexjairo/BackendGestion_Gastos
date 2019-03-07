package com.espe.edu.gestionPagos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sig_proveedor")
public class Proveedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1854191989901678933L;

@Id
@Column(name ="pro_ruc", nullable=false)
private Long proRuc;

@Column(name="pro_nombre ")
private String proNombre;

@Column(name=" pro_telefono ")
private int proTelf;

@Column(name="pro_contacto")
private String proContacto;

@Column(name ="pro_contacto_dato")
private String proContactDato;

@Column(name="pro_contacto_email")
private String proContactEmail;

/**
 * @return the proRuc
 */
public Long getProRuc() {
	return proRuc;
}

/**
 * @param proRuc the proRuc to set
 */
public void setProRuc(Long proRuc) {
	this.proRuc = proRuc;
}

/**
 * @return the proNombre
 */
public String getProNombre() {
	return proNombre;
}

/**
 * @param proNombre the proNombre to set
 */
public void setProNombre(String proNombre) {
	this.proNombre = proNombre;
}

/**
 * @return the proTelf
 */
public int getProTelf() {
	return proTelf;
}

/**
 * @param proTelf the proTelf to set
 */
public void setProTelf(int proTelf) {
	this.proTelf = proTelf;
}

/**
 * @return the proContacto
 */
public String getProContacto() {
	return proContacto;
}

/**
 * @param proContacto the proContacto to set
 */
public void setProContacto(String proContacto) {
	this.proContacto = proContacto;
}

/**
 * @return the proContactDato
 */
public String getProContactDato() {
	return proContactDato;
}

/**
 * @param proContactDato the proContactDato to set
 */
public void setProContactDato(String proContactDato) {
	this.proContactDato = proContactDato;
}

/**
 * @return the proContactEmail
 */
public String getProContactEmail() {
	return proContactEmail;
}

/**
 * @param proContactEmail the proContactEmail to set
 */
public void setProContactEmail(String proContactEmail) {
	this.proContactEmail = proContactEmail;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Proveedor [proRuc=" + proRuc + ", proNombre=" + proNombre + ", proTelf=" + proTelf + ", proContacto="
			+ proContacto + ", proContactDato=" + proContactDato + ", proContactEmail=" + proContactEmail + "]";
}





	

}
