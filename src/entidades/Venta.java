package entidades;

import java.time.LocalDate;

/**
 * @author nacho
 */
public class Venta {
    private int idVenta;
    private Cliente idCliente;
    private LocalDate fecha;
    
    public Venta(){}
    public Venta(Cliente idCliente, LocalDate fecha){
        this.idCliente = idCliente;
        this.fecha = fecha;
    }
    public Venta(int idVenta, Cliente idCliente, LocalDate fecha){
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.fecha = fecha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
        
    @Override
    public String toString(){
        return idCliente.getNombre()+" "+fecha;
    }
}
