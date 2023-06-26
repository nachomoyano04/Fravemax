package entidades;

/**
 * @author nacho
 */
public class DetalleVenta {
    private int idDetalleVenta;
    private int cantidad;
    private int precioVenta;
    private Cliente idCliente;
    private Producto idProducto;

    public DetalleVenta(){}
    public DetalleVenta(int cantidad, int precioVenta, Cliente idCliente, Producto idProducto){
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.idCliente = idCliente; 
        this.idProducto = idProducto;
    }
    public DetalleVenta(int idDetalleVenta, int cantidad, int precioVenta, Cliente idCliente, Producto idProducto){
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.idCliente = idCliente; 
        this.idProducto = idProducto;
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

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }
    
    @Override
    public String toString(){
        return cantidad+", "+precioVenta+", "+idCliente.getNombre()+", "+idProducto.getDescripcion();
    }
}
