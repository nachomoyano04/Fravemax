package entidades;

import java.math.BigDecimal;

/**
 * @author nacho
 */
public class Producto {
    private int idProducto;
    private String descripcion;
    private BigDecimal precioActual;
    private int stock;
    private int estado;
    
    public Producto(){}
    public Producto(String descripcion, BigDecimal precioActual, int stock, int estado){
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }
    public Producto(int idProducto, String descripcion, BigDecimal precioActual, int stock, int estado){
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(BigDecimal precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
