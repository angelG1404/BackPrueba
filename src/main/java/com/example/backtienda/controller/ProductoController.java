package com.example.backtienda.controller;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.backtienda.model.*;
import com.example.backtienda.services.*;
import java.util.*;

@RestController
public class ProductoController {
	private final ProductoService productoServicio;
	
	public ProductoController(ProductoService productoServicio) {
        this.productoServicio = productoServicio;
    }
	
    @PostMapping("/productos")
    public void insertar(@RequestBody Producto producto) {
    	System.out.println(producto.getNombre());
    	productoServicio.insertar(producto);
    	System.out.println("Ya se inserto");
    }
    @PutMapping("/productos/{id}")
    public void modificar(@PathVariable int id,
    		@RequestBody Producto producto) {
    	productoServicio.modificar(id,producto);
    }
    @DeleteMapping("/eliminarProductos/{id}")
    public void eliminar(@PathVariable int id) {
    	productoServicio.eliminar(id);
    }
    @GetMapping("/listarProductos")
    public List<Producto> listarTodos() {
    	return productoServicio.listarTodos();
    }

    @GetMapping("/obtenerId/{id}")
    public Producto obtenerxId(@PathVariable int id) {
         return productoServicio.obtenerxId(id);
    }

}
