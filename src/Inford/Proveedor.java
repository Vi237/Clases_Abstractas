package Inford;

public class Proveedor {
    private String NIT;
    private String direccion;

    public Proveedor(String NIT, String direccion) {
        this.setNIT(NIT);
        this.setDireccion(direccion);
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
