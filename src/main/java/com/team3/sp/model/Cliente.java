package com.team3.sp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente3")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String Nombre;
	
	@Column
	private String Direccion;
	
	@Column
	private String Correo;
	
	@Column
	private String Telefono;
	
	@Column 
	private double Saldo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	//lo almacedano en la clase InputData
	private String Ejecutivo;
	
	public String getEjecutivo() {
		return Ejecutivo;
	}

	public void setEjecutivo(String ejecutivo) {
		Ejecutivo = ejecutivo;
	}

	
	
	public Cliente(String nombre, String telefono, String direccion, String correo, String ejecutivo, double saldo) {
		super();
		this.Nombre = nombre;
		this.Telefono = telefono;
		this.Direccion = direccion;
		this.Correo = correo;
		this.Ejecutivo = ejecutivo;
		this.Saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + Nombre + ", telefono=" + Telefono + ", direccion=" + Direccion + ", correo=" + Correo
				+ ", ejecutivo=" + Ejecutivo + ", saldo=" + Saldo + "]";
	}
	public Cliente(){}
}
