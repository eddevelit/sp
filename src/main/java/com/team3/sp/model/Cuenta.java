package com.team3.sp.model;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cuenta3")
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private double Saldo;
	
	@Column
	private String Ejecutivo;
	
	@Column
	private int id_cliente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public String getEjecutivo() {
		return Ejecutivo;
	}
	public void setEjecutivo(String ejecutivo) {
		Ejecutivo = ejecutivo;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	//lo almacedano en la clase OutputData
	public String numeroCuenta;
	public String numeroCliente;
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public String getNumeroCliente() {
		return numeroCliente;
	}
	
	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
	
	public Cuenta(String numeroCuenta, String numeroCliente, Double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.numeroCliente = numeroCliente;
		this.Saldo = saldo;
	}
	public Cuenta(){}

	public Cuenta(Map<String, Object> out) {
		// TODO Auto-generated constructor stub
		super();
		this.numeroCliente = out.get("idcliente").toString();
        this.numeroCuenta = out.get("idcuenta").toString();
        this.Saldo = Double.parseDouble(out.get("saldoOut").toString());
	}
}
