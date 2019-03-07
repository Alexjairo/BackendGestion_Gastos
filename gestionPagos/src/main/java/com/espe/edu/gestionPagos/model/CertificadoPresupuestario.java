package com.espe.edu.gestionPagos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="sig_certificado_presupuestario")
public class CertificadoPresupuestario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -973062062063103229L;
	
	@Id
	@Column(name = "cepre_numero_certificado", nullable = false)
	private Long certId;
	
	
	@NotNull
	@ManyToOne
	@JoinColumn(name=" cont_id_contrato")
	private Contrato contrato;
	
	@NotNull
	@OneToOne
	@JoinColumn(name=" mant_numero_mantenimi")
	private Mantenimiento mantenimento;
	
	@Column (name="cepre_valor")
	private float valor;
	
	@Column (name="cepre_objeto")
	private String objeto;
	
	@Column (name="cepre_codigo_presupuestario")
	private int codigo;
	
	
	@Column (name="cepre_descripcion")
	private String descripcion;
	
	@Column(name="cepre_ruc ")
	private int ruc;

	/**
	 * @return the certId
	 */
	public Long getCertId() {
		return certId;
	}

	/**
	 * @param certId the certId to set
	 */
	public void setCertId(Long certId) {
		this.certId = certId;
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
	 * @return the mantenimento
	 */
	public Mantenimiento getMantenimento() {
		return mantenimento;
	}

	/**
	 * @param mantenimento the mantenimento to set
	 */
	public void setMantenimento(Mantenimiento mantenimento) {
		this.mantenimento = mantenimento;
	}

	/**
	 * @return the valor
	 */
	public float getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(float valor) {
		this.valor = valor;
	}

	/**
	 * @return the objeto
	 */
	public String getObjeto() {
		return objeto;
	}

	/**
	 * @param objeto the objeto to set
	 */
	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the ruc
	 */
	public int getRuc() {
		return ruc;
	}

	/**
	 * @param ruc the ruc to set
	 */
	public void setRuc(int ruc) {
		this.ruc = ruc;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CertificadoPresupuestario [certId=" + certId + ", contrato=" + contrato + ", mantenimento="
				+ mantenimento + ", valor=" + valor + ", objeto=" + objeto + ", codigo=" + codigo + ", descripcion="
				+ descripcion + ", ruc=" + ruc + "]";
	}

	
}
