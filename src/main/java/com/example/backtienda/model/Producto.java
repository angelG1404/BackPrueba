package com.example.backtienda.model;
import jakarta.persistence.*;
@Entity
@Table(name = "Producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProducto")
	private int idProducto;
	private String nombre;
	private double precio;
	private String marca;
	private String descripcion;
	
	public Producto(String nombre, double precio,
			String marca, String descripcion) {
		this.nombre=nombre;
		this.precio=precio;
		this.marca=marca;
		this.descripcion=descripcion;
	}
	public Producto() {
	}
	// Getter y Setter idProducto
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    // Getter y Setter nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter y Setter marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter y Setter descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
	
}
