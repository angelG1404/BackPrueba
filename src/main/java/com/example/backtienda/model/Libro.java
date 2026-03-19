package com.example.backtienda.model;
import lombok.Data;
@Data
public class Libro {
	private int id;
	private String titulo;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public int getId() {
		return this.id;
	}
}
