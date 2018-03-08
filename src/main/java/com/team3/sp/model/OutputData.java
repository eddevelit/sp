package com.team3.sp.model;

import java.util.Map;

public class OutputData {

	
	public String numeroCuenta;
	public String numeroCliente;
	public Double saldo;
	
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
	
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public OutputData(String numeroCuenta, String numeroCliente, Double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.numeroCliente = numeroCliente;
		this.saldo = saldo;
	}
	public OutputData(){}

	public OutputData(Map<String, Object> out) {
		// TODO Auto-generated constructor stub
		super();
		this.numeroCliente = out.get("idcliente").toString();
        this.numeroCuenta = out.get("idcuenta").toString();
        this.saldo = Double.parseDouble(out.get("saldoOut").toString());
	}
}
