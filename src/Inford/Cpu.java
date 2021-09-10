package Inford;

import Interfaces.IReseteable;

import java.util.Date;

public class Cpu extends Tecnologico implements IReseteable {
    private int memoriaPricipal;

    public Cpu(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante, int memoriaPricipal) {
        super(codigo, modelo, paisOrigen, fechaFabricacion, fabricante);
        this.setMemoriaPricipal(memoriaPricipal);
    }

    public int getMemoriaPricipal() {
        return memoriaPricipal;
    }

    public void setMemoriaPricipal(int memoriaPricipal) {
        this.memoriaPricipal = memoriaPricipal;
    }

    @Override
    public void reset() {
        System.out.println("Reseteando al estado de fabrica...");
    }

    @Override
    public void estado() {
        System.out.println("Años de uso:"+10);
    }
}
