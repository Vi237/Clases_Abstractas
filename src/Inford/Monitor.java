package Inford;

import Interfaces.IReseteable;

public class Monitor extends Alquiler implements IReseteable {
    private String resolucionMaxima;

    public Monitor(String codigo, String modelo, double precioHora, String resolucionMaxima) {
        super(codigo, modelo, precioHora);
        this.setResolucionMaxima(resolucionMaxima);
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "precioHora=" + precioHora +
                ", resolucionMaxima='" + resolucionMaxima + '\'' +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void estado() {
        System.out.println("Brillo:"+70+"%");
    }

    @Override
    public void reset() {
        System.out.println("Reseteando monitor...");
    }
}
