package com.espe.edu.gestionPagos.model;

import java.io.Serializable;

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
@Table(name="detalle_calculo")
public class DetalleCalculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1831733113779034330L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="detcal_numero_detalle ", nullable=false)
	private Long numDet;
	
	
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="ordga_numero_orden")
	private OrdenGastos ordenGastos;
	
	
	@Column(name=" detcal_valor")
	private float detcalValor;


	/**
	 * @return the numDet
	 */
	public Long getNumDet() {
		return numDet;
	}


	/**
	 * @param numDet the numDet to set
	 */
	public void setNumDet(Long numDet) {
		this.numDet = numDet;
	}


	/**
	 * @return the ordenGastos
	 */
	public OrdenGastos getOrdenGastos() {
		return ordenGastos;
	}


	/**
	 * @param ordenGastos the ordenGastos to set
	 */
	public void setOrdenGastos(OrdenGastos ordenGastos) {
		this.ordenGastos = ordenGastos;
	}


	/**
	 * @return the detcalValor
	 */
	public float getDetcalValor() {
		return detcalValor;
	}


	/**
	 * @param detcalValor the detcalValor to set
	 */
	public void setDetcalValor(float detcalValor) {
		this.detcalValor = detcalValor;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DetalleCalculo [numDet=" + numDet + ", ordenGastos=" + ordenGastos + ", detcalValor=" + detcalValor
				+ "]";
	}
	
	

}
