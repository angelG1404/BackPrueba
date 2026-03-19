package com.example.backtienda.repository;
//import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backtienda.model.Producto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//@Repository
public interface ProductoRepository extends DBManager<Producto, Integer>{

    @Query(value = "CALL obtener_producto_por_id(:id)", nativeQuery = true)
    Producto obtenerxId(
            @Param("id") int idProducto
    );
}
