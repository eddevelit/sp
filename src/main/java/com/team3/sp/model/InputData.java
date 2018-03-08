package com.team3.sp.model;

public class InputData {
	private String Nombre;
	private String Telefono;
	private String Direccion;
	private String Correo;
	private double Saldo;
	private String Ejecutivo;
		
		public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
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

		
		
		public InputData(String nombre, String telefono, String direccion, String correo, String ejecutivo, double saldo) {
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
			return "InputData [nombre=" + Nombre + ", telefono=" + Telefono + ", direccion=" + Direccion + ", correo=" + Correo
					+ ", ejecutivo=" + Ejecutivo + ", saldo=" + Saldo + "]";
		}
		public InputData(){}
}
