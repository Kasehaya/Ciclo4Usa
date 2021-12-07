package com.usa.mongoapp.controlador;

import com.usa.mongoapp.entidad.Producto;
import com.usa.mongoapp.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ProductoControlador {

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/all")
    public List<Producto> getProductos() {
        return productoServicio.getProductos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> getProducto(@PathVariable("idProducto") int idProducto) {
        return productoServicio.getProducto(idProducto);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoServicio.guardarProducto(producto);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto actualizarProducto(@RequestBody Producto producto) {
        return productoServicio.actualizarProducto(producto);
    }

    @DeleteMapping("/{idProducto}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean borrarProducto(@PathVariable("idProducto") int idProducto) {
        return productoServicio.borrarProducto(idProducto);
    }

}
