package com.API.Stream.Tareas.Models;

public class Producto {
	
	private double precio;
	private int cantidad;
	
	public Producto(double precio, int cantidad) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public double getImporte() {
		return precio * cantidad;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Precio: " + precio + ", Cantidad: " + cantidad + ", Importe: " + getImporte();
	}
	
	

}
