package entidades;

import java.time.LocalDate;

/**
 * @author nacho
 */
public class Compra {
    private int idCompra;
    private LocalDate fecha;
    private Proveedor proveedor;

    public Compra() {
    }

    public Compra(LocalDate fecha, Proveedor proveedor) {
        this.fecha = fecha;
        this.proveedor = proveedor;
    }

    public Compra(int idCompra, LocalDate fecha, Proveedor proveedor) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.proveedor = proveedor;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return fecha + ", " + proveedor.getRazonSocial();
    }
    
    
}
