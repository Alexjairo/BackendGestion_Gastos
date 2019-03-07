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
@Table(name="sig_mantenimiento")
public class Mantenimiento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8237820793045632088L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="mant_numero_mantenimi")
	private Long numMant;
	
	@NotNull
	@ManyToOne 
	@JoinColumn(name="cont_id_contrato ")
	private Contrato contrato;
	
	
	@Column(name=" mant_fecha")
	private Date mantFecha;
	
	@Column(name="mant_valor")
	private float mantValor;
	
	@Column(name="mant_fecha_pago")
	private float fechaPag;
	
	@Column(name="mant_iva")
	private double mantIva;
	
	@Column(name="mant_ruc")
	private int mantRuc;
	
	@Column(name="mant_informacion")
	private String mantInfo;

	/**
	 * @return the numMant
	 */
	public Long getNumMant() {
		return numMant;
	}

	/**
	 * @param numMant the numMant to set
	 */
	public void setNumMant(Long numMant) {
		this.numMant = numMant;
	}

	/**
	 * @return the contrato
	 */
	public Contrato getContrato() {
		return contrato;
	}

	/**
	 * @param contrato the contrato to set
	 */
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	/**
	 * @return the mantFecha
	 */
	public Date getMantFecha() {
		return mantFecha;
	}

	/**
	 * @param mantFecha the mantFecha to set
	 */
	public void setMantFecha(Date mantFecha) {
		this.mantFecha = mantFecha;
	}

	/**
	 * @return the mantValor
	 */
	public float getMantValor() {
		return mantValor;
	}

	/**
	 * @param mantValor the mantValor to set
	 */
	public void setMantValor(float mantValor) {
		this.mantValor = mantValor;
	}

	/**
	 * @return the fechaPag
	 */
	public float getFechaPag() {
		return fechaPag;
	}

	/**
	 * @param fechaPag the fechaPag to set
	 */
	public void setFechaPag(float fechaPag) {
		this.fechaPag = fechaPag;
	}

	/**
	 * @return the mantIva
	 */
	public double getMantIva() {
		return mantIva;
	}

	/**
	 * @param mantIva the mantIva to set
	 */
	public void setMantIva(double mantIva) {
		this.mantIva = mantIva;
	}

	/**
	 * @return the mantRuc
	 */
	public int getMantRuc() {
		return mantRuc;
	}

	/**
	 * @param mantRuc the mantRuc to set
	 */
	public void setMantRuc(int mantRuc) {
		this.mantRuc = mantRuc;
	}

	/**
	 * @return the mantInfo
	 */
	public String getMantInfo() {
		return mantInfo;
	}

	/**
	 * @param mantInfo the mantInfo to set
	 */
	public void setMantInfo(String mantInfo) {
		this.mantInfo = mantInfo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mantenimiento [numMant=" + numMant + ", contrato=" + contrato + ", mantFecha=" + mantFecha
				+ ", mantValor=" + mantValor + ", fechaPag=" + fechaPag + ", mantIva=" + mantIva + ", mantRuc="
				+ mantRuc + ", mantInfo=" + mantInfo + "]";
	}
	
	
	
}
