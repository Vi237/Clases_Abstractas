package Inford;

public class Servicio {
    private Cliente cliente;
    private Impresora impresora;
    private String descripcion;
    double totalFacturado;

    public Servicio(Cliente cliente, Impresora impresora, String descripcion, double totalFacturado) {
        this.setCliente(cliente);
        this.setImpresora(impresora);
        this.setDescripcion(descripcion);
        this.totalFacturado = totalFacturado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
