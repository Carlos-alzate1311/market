package com.project.market.persistence.crud;

import com.project.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOrdenByNombreAsc(int idCategoria);
    Optional<List<Producto>> finByCantidadStockLessThanAndEstado (int cantidadStock, Boolean estado);


}
