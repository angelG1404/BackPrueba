package com.example.backtienda.services;

import java.util.List;
//import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.example.backtienda.model.Producto;

import com.example.backtienda.repository.ProductoRepository;
@Service
//@Transactional
public class ProductoService implements Base<Producto>{
	private final ProductoRepository repo;
	public ProductoService(ProductoRepository repo) {
		this.repo=repo;
	}
	public void insertar(Producto objeto) {
		repo.save(objeto);
	}
	public void modificar(int id,Producto objeto) {
		Producto p = repo.findById(id).get();
		p=objeto;
		repo.save(p);
	}
	public void eliminar(int idObjeto) {
		repo.deleteById(idObjeto);
	}
	public List<Producto> listarTodos(){
		return repo.findAll();
	}



	public Producto obtenerxId(int id){
		return repo.obtenerxId(id);
	}
}
