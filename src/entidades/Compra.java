package entidades;

import java.time.LocalDate;

/**
 * @author nacho
 */
public class Compra {
    private int idCompra;
    private LocalDate fecha;
    private Proveedor idProveedor;

    public Compra() {
    }

    public Compra(LocalDate fecha, Proveedor idProveedor) {
        this.fecha = fecha;
        this.idProveedor = idProveedor;
    }

    public Compra(int idCompra, LocalDate fecha, Proveedor idProveedor) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.idProveedor = idProveedor;
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

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return fecha + ", " + idProveedor.getRazonSocial();
    }
    
    
}
