package entidades;

import java.time.LocalDate;

/**
 * @author nacho
 */
public class Venta {
    private int idVenta;
    private Cliente cliente;
    private LocalDate fecha;
    
    public Venta(){}
    public Venta(Cliente cliente, LocalDate fecha){
        this.cliente = cliente;
        this.fecha = fecha;
    }
    public Venta(int idVenta, Cliente cliente, LocalDate fecha){
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
        
    @Override
    public String toString(){
        return cliente.getNombre()+" "+fecha;
    }
}
