package com.espe.edu.gestionPagos.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="sig_contrato")
public class Contrato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4842853573131767052L;
	
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="cont_id_contrato",nullable=false)
private Long idContrato;

@NotNull
@ManyToOne
@JoinColumn (name=" cont_ruc")
private Proveedor proveedor;

@Column(name=" cont_tipo_contrato")
private String tipCont;

@Column(name=" cont_numero_contrato")
private String numCont;

@Column(name="cont_fecha")
private Date contFecha;

@Column(name="cont_plazo")
private String contPlazo;

@Column(name="cont_garantia_tecnico")
private Date contGarantec;

@Column(name="cont_atministracion")
private String contAdmi;

@Column(name="cont_tecnico")
private String contTec;

@Column(name="cont_precio")
private float contPrecio;

@Column(name="cont_modo_pago")
private String contModPag;

@Column(name="cont_fecha_ini")
private Date contFechaIni;

@Column(name="cont_fecha_fin")
private Date contFechaFin;

@Column(name="cont_mantenimiento")
private String contMant;

@Column(name="cont_fecha_ini_man")
private Date contFechaIniMan;

@Column(name="cont_fecha_fin_man")
private Date contFechaFinMan;

@Column(name="cont_objeto")
private String contObjeto;

@Column(name="cont_fecha_actualizacion_definitiva ")
private Date contFechaActDef;

/**
 * @return the idContrato
 */
public Long getIdContrato() {
	return idContrato;
}

/**
 * @param idContrato the idContrato to set
 */
public void setIdContrato(Long idContrato) {
	this.idContrato = idContrato;
}

/**
 * @return the proveedor
 */
public Proveedor getProveedor() {
	return proveedor;
}

/**
 * @param proveedor the proveedor to set
 */
public void setProveedor(Proveedor proveedor) {
	this.proveedor = proveedor;
}

/**
 * @return the tipCont
 */
public String getTipCont() {
	return tipCont;
}

/**
 * @param tipCont the tipCont to set
 */
public void setTipCont(String tipCont) {
	this.tipCont = tipCont;
}

/**
 * @return the numCont
 */
public String getNumCont() {
	return numCont;
}

/**
 * @param numCont the numCont to set
 */
public void setNumCont(String numCont) {
	this.numCont = numCont;
}

/**
 * @return the contFecha
 */
public Date getContFecha() {
	return contFecha;
}

/**
 * @param contFecha the contFecha to set
 */
public void setContFecha(Date contFecha) {
	this.contFecha = contFecha;
}

/**
 * @return the contPlazo
 */
public String getContPlazo() {
	return contPlazo;
}

/**
 * @param contPlazo the contPlazo to set
 */
public void setContPlazo(String contPlazo) {
	this.contPlazo = contPlazo;
}

/**
 * @return the contGarantec
 */
public Date getContGarantec() {
	return contGarantec;
}

/**
 * @param contGarantec the contGarantec to set
 */
public void setContGarantec(Date contGarantec) {
	this.contGarantec = contGarantec;
}

/**
 * @return the contAdmi
 */
public String getContAdmi() {
	return contAdmi;
}

/**
 * @param contAdmi the contAdmi to set
 */
public void setContAdmi(String contAdmi) {
	this.contAdmi = contAdmi;
}

/**
 * @return the contTec
 */
public String getContTec() {
	return contTec;
}

/**
 * @param contTec the contTec to set
 */
public void setContTec(String contTec) {
	this.contTec = contTec;
}

/**
 * @return the contPrecio
 */
public float getContPrecio() {
	return contPrecio;
}

/**
 * @param contPrecio the contPrecio to set
 */
public void setContPrecio(float contPrecio) {
	this.contPrecio = contPrecio;
}

/**
 * @return the contModPag
 */
public String getContModPag() {
	return contModPag;
}

/**
 * @param contModPag the contModPag to set
 */
public void setContModPag(String contModPag) {
	this.contModPag = contModPag;
}

/**
 * @return the contFechaIni
 */
public Date getContFechaIni() {
	return contFechaIni;
}

/**
 * @param contFechaIni the contFechaIni to set
 */
public void setContFechaIni(Date contFechaIni) {
	this.contFechaIni = contFechaIni;
}

/**
 * @return the contFechaFin
 */
public Date getContFechaFin() {
	return contFechaFin;
}

/**
 * @param contFechaFin the contFechaFin to set
 */
public void setContFechaFin(Date contFechaFin) {
	this.contFechaFin = contFechaFin;
}

/**
 * @return the contMant
 */
public String getContMant() {
	return contMant;
}

/**
 * @param contMant the contMant to set
 */
public void setContMant(String contMant) {
	this.contMant = contMant;
}

/**
 * @return the contFechaIniMan
 */
public Date getContFechaIniMan() {
	return contFechaIniMan;
}

/**
 * @param contFechaIniMan the contFechaIniMan to set
 */
public void setContFechaIniMan(Date contFechaIniMan) {
	this.contFechaIniMan = contFechaIniMan;
}

/**
 * @return the contFechaFinMan
 */
public Date getContFechaFinMan() {
	return contFechaFinMan;
}

/**
 * @param contFechaFinMan the contFechaFinMan to set
 */
public void setContFechaFinMan(Date contFechaFinMan) {
	this.contFechaFinMan = contFechaFinMan;
}

/**
 * @return the contObjeto
 */
public String getContObjeto() {
	return contObjeto;
}

/**
 * @param contObjeto the contObjeto to set
 */
public void setContObjeto(String contObjeto) {
	this.contObjeto = contObjeto;
}

/**
 * @return the contFechaActDef
 */
public Date getContFechaActDef() {
	return contFechaActDef;
}

/**
 * @param contFechaActDef the contFechaActDef to set
 */
public void setContFechaActDef(Date contFechaActDef) {
	this.contFechaActDef = contFechaActDef;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Contrato [idContrato=" + idContrato + ", proveedor=" + proveedor + ", tipCont=" + tipCont + ", numCont="
			+ numCont + ", contFecha=" + contFecha + ", contPlazo=" + contPlazo + ", contGarantec=" + contGarantec
			+ ", contAdmi=" + contAdmi + ", contTec=" + contTec + ", contPrecio=" + contPrecio + ", contModPag="
			+ contModPag + ", contFechaIni=" + contFechaIni + ", contFechaFin=" + contFechaFin + ", contMant="
			+ contMant + ", contFechaIniMan=" + contFechaIniMan + ", contFechaFinMan=" + contFechaFinMan
			+ ", contObjeto=" + contObjeto + ", contFechaActDef=" + contFechaActDef + "]";
}





}
