package entidades;

/**
 * @author nacho
 */
public class DetalleCompra {
    private int idDetalleCompra;
    private int cantidad;
    private int precioCosto;
    private Compra idCompra;
    private Producto idProducto;

    public DetalleCompra(){}
    public DetalleCompra(int cantidad, int precioCosto, Compra idCompra, Producto idProducto){
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
    }
    public DetalleCompra(int idDetalleCompra, int cantidad, int precioCosto, Compra idCompra, Producto idProducto){
        this.idDetalleCompra = idDetalleCompra;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
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

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return cantidad+", "+precioCosto+", "+idCompra.getIdProveedor().getRazonSocial()+", "+idProducto.getDescripcion();
    }
    
    
}
