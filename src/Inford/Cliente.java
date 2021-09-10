package Inford;

public class Cliente {
    private String Dni;
    private int telefono;
    private String direccion;

    public Cliente(String dni, int telefono, String direccion) {
        setDni(dni);
        this.setTelefono(telefono);
        this.setDireccion(direccion);
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
