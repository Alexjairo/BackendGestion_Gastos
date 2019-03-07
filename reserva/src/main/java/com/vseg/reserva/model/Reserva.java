package com.vseg.reserva.model;

import java.io.Serializable;
import java.sql.Timestamp;
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
@Table(name = "VSE_RESERVA")

public class Reserva implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "RES_ID", nullable = false)
	private Long resId;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "US_ID")
	private Usuario usuario;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "VUELO_ID")
	private Vuelo vuelo;
	
	
	@NotNull
	@Column(name = "RES_ESTADO")
	private Boolean estado;
	
	@NotNull
	@Column(name = "RES_FECHA_HORA")
    private Timestamp fechaHora;
	
	@NotNull
	@Column(name = "RES_CODIGO")
    private String codigo;

	/**
	 * @return the resId
	 */
	public Long getResId() {
		return resId;
	}

	/**
	 * @param resId the resId to set
	 */
	public void setResId(Long resId) {
		this.resId = resId;
	}

	/**
	 * @return the user
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the vuelo
	 */
	public Vuelo getVuelo() {
		return vuelo;
	}

	/**
	 * @param vuelo the vuelo to set
	 */
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	/**
	 * @return the estado
	 */
	public Boolean getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	/**
	 * @return the fechaHora
	 */
	public Timestamp getFechaHora() {
		return fechaHora;
	}

	/**
	 * @param fechaHora the fechaHora to set
	 */
	public void setFechaHora(Timestamp fechaHora) {
		this.fechaHora = fechaHora;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Reserva [resId=" + resId + ", usuario=" + usuario + ", vuelo=" + vuelo + ", estado=" + estado
				+ ", fechaHora=" + fechaHora + ", codigo=" + codigo + ", getResId()=" + getResId() + ", getUsuario()="
				+ getUsuario() + ", getVuelo()=" + getVuelo() + ", getEstado()=" + getEstado() + ", getFechaHora()="
				+ getFechaHora() + ", getCodigo()=" + getCodigo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


}