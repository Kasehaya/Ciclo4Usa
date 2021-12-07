package com.usa.mongoapp.servicio;

import com.usa.mongoapp.entidad.Producto;
import com.usa.mongoapp.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<Producto> getProductos() {
        return (List<Producto>) productoRepositorio.findAll();
    }

    public Optional<Producto> getProducto(int idProducto) {
        return productoRepositorio.findById(idProducto);
    }

    public Producto guardarProducto(Producto producto) {
        if (producto.getIdProducto() == null) {
            return productoRepositorio.save(producto);
        } else {
            Optional<Producto> tmpProducto = productoRepositorio.findById(producto.getIdProducto());
            if (tmpProducto.isEmpty()) {
                return productoRepositorio.save(producto);
            } else {
                return producto;
            }
        }
    }

    public Producto actualizarProducto(Producto producto) {
        if (producto.getIdProducto() != null) {
            Optional<Producto> p = productoRepositorio.findById(producto.getIdProducto());
            if (p.isEmpty()) {
                if (producto.getIdProducto() != null) {
                    p.get().setidProducto(producto.getIdProducto());
                }
                if (producto.getNombreProd() != null) {
                    p.get().setNombreProd(producto.getNombreProd());
                }
                if (producto.getPrecio() != null) {
                    p.get().setPrecio(producto.getPrecio());
                }
                if (producto.getCategoria() != null) {
                    p.get().setCategoria(producto.getCategoria());
                }
                if (producto.getStock() != null) {
                    p.get().setStock(producto.getStock());
                }
                if (producto.getDescripcion() != null) {
                    p.get().setDescripcion(producto.getDescripcion());
                }
                return productoRepositorio.save(p.get());
            } else {
                return producto;
            }
        } else {
            return producto;
        }
    }

    public boolean borrarProducto(int idProducto) {
        Boolean aBoolean = getProducto(idProducto).map(producto -> {
            productoRepositorio.delete(producto);
            return true;
        }).orElse(false);
        return aBoolean;
    }

}

