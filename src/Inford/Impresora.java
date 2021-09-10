package Inford;

import Interfaces.IReseteable;

public class Impresora extends Producto implements IReseteable {
    private int velocidad;

    public Impresora(String codigo, String modelo, int velocidad) {
        super(codigo, modelo);
        this.setVelocidad(velocidad);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "velocidad=" + velocidad +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void estado() {
        System.out.println("Paginas Impresas:"+151652);
    }

    @Override
    public void reset() {
        System.out.println("Reseteando impresora...");
    }
}