package com.usa.mongoapp.entidad;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "producto")
public class Producto {

    @Id
    private Integer idProducto;
    private String nombreProd;
    private Integer precio;
    private String categoria;
    private Integer stock;
    private String descripcion;

    public Producto() {
    }

    public Producto(Integer idProducto, String nombreProd, Integer precio, String categoria, Integer stock, String descripcion) {
        this.idProducto = idProducto;
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        this.descripcion = descripcion;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setidProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
