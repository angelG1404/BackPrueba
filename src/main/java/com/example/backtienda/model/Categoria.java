package com.example.backtienda.model;
import jakarta.persistence.*;
@Entity
@Table(name = "Categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;
	private String nombre;
	
	public Categoria(String nombre ) {
		this.nombre=nombre;
	}
	public Categoria() {
	}
	public void setId(int id) {
		this.idCategoria=id;
	}
	public int getId() {
		return this.idCategoria;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
}
