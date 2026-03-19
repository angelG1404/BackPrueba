package com.example.backtienda.services;
import java.util.*;
public interface Base<T> {
	void insertar(T objeto);
	void modificar(int id,T objeto);
	void eliminar(int idObjeto);
	List<T> listarTodos();
}
