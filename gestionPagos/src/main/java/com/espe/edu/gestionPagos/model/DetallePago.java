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
@Table(name="sig_detalle_pago")
public class DetallePago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3672707263219440158L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="depa_id_detalle", nullable=false)
    private Long depaDetId;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="depa_id_contrato")
	private Contrato contrato;
	
	@Column(name="depa_orden")
	private String depOrden;

	/**
	 * @return the depaId
	 */
	public Long getDepaId() {
		return depaDetId;
	}

	/**
	 * @param depaId the depaId to set
	 */
	public void setDepaId(Long depaId) {
		this.depaDetId = depaId;
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
	 * @return the depOrden
	 */
	public String getDepOrden() {
		return depOrden;
	}

	/**
	 * @param depOrden the depOrden to set
	 */
	public void setDepOrden(String depOrden) {
		this.depOrden = depOrden;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DetallePago [depaId=" + depaDetId + ", contrato=" + contrato + ", depOrden=" + depOrden + "]";
	}
    

}
