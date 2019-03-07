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
@Table(name="sig_orden_gasto")

public class OrdenGastos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9190572552288605715L;


@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name ="ordga_numero_orden", nullable =false)
private long  numOrden;

@NotNull
@ManyToOne
@JoinColumn(name="datemp_ci ")
private DatosEmpleado datempCi ;

@NotNull
@ManyToOne
@JoinColumn(name="cepre_numero_certificado ")
private CertificadoPresupuestario certificadoPresupuestario;


@NotNull
@ManyToOne
@JoinColumn(name="cont_id_contrato")
private Contrato contrato;

@Column(name="ordga_fecha_orden_gasto ")
private Date fechaOrdenGasto;

@Column(name=" ordga_contrato")
private String ordgaContrato;

@Column(name="ordga_precio_unitario ")
private float precioUnitario;

@Column(name="ordga_subtotal")
private float subtotal;

@Column(name="ordga_iva")
private float iva;

@Column(name=" ordga_otro_impuesto")
private float otroImpuesto;

@Column(name="ordga_total")
private float total;

@Column(name="ordga_codigo_presupuestario ")
private int codPresupuestario;

@Column(name=" ordga_descripcion")
private String descripcion;

@Column(name="ordga_valor_certificado ")
private float valCert;

@Column(name=" ordgagasto_afectuar")
private float afectuar;

@Column(name="ordga_saldo")
private float saldo;

@Column(name="ordga_ruc")
private int ruc;


@Column(name="ordga_tipo_pago")
private String tipPago;

@Column(name=" ordga_meses_acumulables ")
private String mesesAcumulables;

/**
 * @return the numOrden
 */
public long getNumOrden() {
	return numOrden;
}

/**
 * @param numOrden the numOrden to set
 */
public void setNumOrden(long numOrden) {
	this.numOrden = numOrden;
}

/**
 * @return the datempCi
 */
public DatosEmpleado getDatempCi() {
	return datempCi;
}

/**
 * @param datempCi the datempCi to set
 */
public void setDatempCi(DatosEmpleado datempCi) {
	this.datempCi = datempCi;
}

/**
 * @return the certificadoPresupuestario
 */
public CertificadoPresupuestario getCertificadoPresupuestario() {
	return certificadoPresupuestario;
}

/**
 * @param certificadoPresupuestario the certificadoPresupuestario to set
 */
public void setCertificadoPresupuestario(CertificadoPresupuestario certificadoPresupuestario) {
	this.certificadoPresupuestario = certificadoPresupuestario;
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
 * @return the fechaOrdenGasto
 */
public Date getFechaOrdenGasto() {
	return fechaOrdenGasto;
}

/**
 * @param fechaOrdenGasto the fechaOrdenGasto to set
 */
public void setFechaOrdenGasto(Date fechaOrdenGasto) {
	this.fechaOrdenGasto = fechaOrdenGasto;
}

/**
 * @return the ordgaContrato
 */
public String getOrdgaContrato() {
	return ordgaContrato;
}

/**
 * @param ordgaContrato the ordgaContrato to set
 */
public void setOrdgaContrato(String ordgaContrato) {
	this.ordgaContrato = ordgaContrato;
}

/**
 * @return the precioUnitario
 */
public float getPrecioUnitario() {
	return precioUnitario;
}

/**
 * @param precioUnitario the precioUnitario to set
 */
public void setPrecioUnitario(float precioUnitario) {
	this.precioUnitario = precioUnitario;
}

/**
 * @return the subtotal
 */
public float getSubtotal() {
	return subtotal;
}

/**
 * @param subtotal the subtotal to set
 */
public void setSubtotal(float subtotal) {
	this.subtotal = subtotal;
}

/**
 * @return the iva
 */
public float getIva() {
	return iva;
}

/**
 * @param iva the iva to set
 */
public void setIva(float iva) {
	this.iva = iva;
}

/**
 * @return the otroImpuesto
 */
public float getOtroImpuesto() {
	return otroImpuesto;
}

/**
 * @param otroImpuesto the otroImpuesto to set
 */
public void setOtroImpuesto(float otroImpuesto) {
	this.otroImpuesto = otroImpuesto;
}

/**
 * @return the total
 */
public float getTotal() {
	return total;
}

/**
 * @param total the total to set
 */
public void setTotal(float total) {
	this.total = total;
}

/**
 * @return the codPresupuestario
 */
public int getCodPresupuestario() {
	return codPresupuestario;
}

/**
 * @param codPresupuestario the codPresupuestario to set
 */
public void setCodPresupuestario(int codPresupuestario) {
	this.codPresupuestario = codPresupuestario;
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
 * @return the valCert
 */
public float getValCert() {
	return valCert;
}

/**
 * @param valCert the valCert to set
 */
public void setValCert(float valCert) {
	this.valCert = valCert;
}

/**
 * @return the afectuar
 */
public float getAfectuar() {
	return afectuar;
}

/**
 * @param afectuar the afectuar to set
 */
public void setAfectuar(float afectuar) {
	this.afectuar = afectuar;
}

/**
 * @return the saldo
 */
public float getSaldo() {
	return saldo;
}

/**
 * @param saldo the saldo to set
 */
public void setSaldo(float saldo) {
	this.saldo = saldo;
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

/**
 * @return the tipPago
 */
public String getTipPago() {
	return tipPago;
}

/**
 * @param tipPago the tipPago to set
 */
public void setTipPago(String tipPago) {
	this.tipPago = tipPago;
}

/**
 * @return the mesesAcumulables
 */
public String getMesesAcumulables() {
	return mesesAcumulables;
}

/**
 * @param mesesAcumulables the mesesAcumulables to set
 */
public void setMesesAcumulables(String mesesAcumulables) {
	this.mesesAcumulables = mesesAcumulables;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "OrdenGastos [numOrden=" + numOrden + ", datempCi=" + datempCi + ", certificadoPresupuestario="
			+ certificadoPresupuestario + ", contrato=" + contrato + ", fechaOrdenGasto=" + fechaOrdenGasto
			+ ", ordgaContrato=" + ordgaContrato + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal
			+ ", iva=" + iva + ", otroImpuesto=" + otroImpuesto + ", total=" + total + ", codPresupuestario="
			+ codPresupuestario + ", descripcion=" + descripcion + ", valCert=" + valCert + ", afectuar=" + afectuar
			+ ", saldo=" + saldo + ", ruc=" + ruc + ", tipPago=" + tipPago + ", mesesAcumulables=" + mesesAcumulables
			+ "]";
}



}
