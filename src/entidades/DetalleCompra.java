package entidades;

/**
 * @author nacho
 */
public class DetalleCompra {
    private int idDetalleCompra;
    private int cantidad;
    private int precioCosto;
    private Compra compra;
    private Producto producto;

    public DetalleCompra(){}
    public DetalleCompra(int cantidad, int precioCosto, Compra compra, Producto producto){
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
    }
    public DetalleCompra(int idDetalleCompra, int cantidad, int precioCosto, Compra compra, Producto producto){
        this.idDetalleCompra = idDetalleCompra;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
    }

    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(int precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return cantidad+", "+precioCosto+", "+compra.getProveedor().getRazonSocial()+", "+producto.getDescripcion();
    }
    
    
}
