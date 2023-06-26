package entidades;

/**
 * @author nacho
 */
public class DetalleCompra {
    private int idDetalleCompra;
    private int cantidad;
    private int precioCosto;
    private Proveedor idProveedor;
    private Producto idProducto;

    public DetalleCompra(){}
    public DetalleCompra(int cantidad, int precioCosto, Proveedor idProveedor, Producto idProducto){
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idProveedor = idProveedor;
        this.idProducto = idProducto;
    }
    public DetalleCompra(int idDetalleCompra, int cantidad, int precioCosto, Proveedor idProveedor, Producto idProducto){
        this.idDetalleCompra = idDetalleCompra;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idProveedor = idProveedor;
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

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return cantidad+", "+precioCosto+", "+idProveedor.getRazonSocial()+", "+idProducto.getDescripcion();
    }
    
    
}
