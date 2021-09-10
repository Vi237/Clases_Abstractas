package Inford;

import java.util.Date;

public class Compra {
    private Proveedor proveedor;
    private Producto producto;
    private Date fecha;
    int catidad;

    public Compra(Proveedor proveedor, Producto producto, Date fecha, int catidad) {
        this.setProveedor(proveedor);
        this.setProducto(producto);
        this.setFecha(fecha);
        this.catidad = catidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}