package entidades;

import java.math.BigDecimal;

/**
 * @author nacho
 */
public class DetalleVenta {
    private int idDetalleVenta;
    private int cantidad;
    private BigDecimal precioVenta;
    private Venta venta;
    private Producto producto;

    public DetalleVenta(){}
    public DetalleVenta(int cantidad, BigDecimal precioVenta, Venta venta, Producto producto){
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.venta = venta; 
        this.producto = producto;
    }
    public DetalleVenta(int idDetalleVenta, int cantidad, BigDecimal precioVenta, Venta venta, Producto producto){
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.venta = venta; 
        this.producto = producto;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    @Override
    public String toString(){
        return cantidad+", "+precioVenta+", "+venta.getCliente().getNombre()+", "+producto.getDescripcion();
    }
}
