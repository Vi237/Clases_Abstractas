package Inford;

public class Soporte {
    private Empresa empresa;
    private Tecnologico Producto;
    private double preicio;

    public Soporte(Empresa empresa, Tecnologico producto, double preicio) {
        this.setEmpresa(empresa);
        setProducto(producto);
        this.setPreicio(preicio);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Tecnologico getProducto() {
        return Producto;
    }

    public void setProducto(Tecnologico producto) {
        Producto = producto;
    }

    public double getPreicio() {
        return preicio;
    }

    public void setPreicio(double preicio) {
        this.preicio = preicio;
    }
}