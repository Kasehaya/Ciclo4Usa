package com.usa.mongoapp.repositorio;

import com.usa.mongoapp.entidad.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepositorio extends MongoRepository<Producto, Integer> {
}
