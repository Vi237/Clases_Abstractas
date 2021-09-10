import Inford.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
       /* Producto producto=new Producto("B562","iluminado");
        System.out.println(producto);
        //alquiler
        Alquiler alquiler=new Alquiler("D461","monitor 06",25.80);
        System.out.println(alquiler);
        //tec
        Empresa empresa=new Empresa("SAMSUNG","av.Ayacucho #145",2136400);
        Tecnologico tecnologico=new Tecnologico("S246","M4656","Korea", Calendar.getInstance().getTime(),empresa);
        System.out.println(tecnologico);
        Monitor monitor=new Monitor("S232","KKJ3265",2.50,"HD");
        System.out.println(monitor);
        Empresa toshiba=new Empresa("TOSHIBA","Av.nose #163",164);
        Cpu cpu=new Cpu("FG152","A12","Japon",Calendar.getInstance().getTime(),toshiba,500);
        System.out.println(cpu);*/

        //POLIMORFISMO
       /* Producto producto=new Producto("H254","H23H");
        Producto xn=new Impresora("xn","cannon 402",30);
        System.out.println(xn);
        Producto xn1=new Monitor("xn1","r400",12,"HD");
        System.out.println(xn1);
        Producto xn2=new DiscoDuro("xn2","hj25",45,500);
        System.out.println(xn2);

        Impresora impresora=(Impresora) xn;
        System.out.println(impresora);
        Monitor monitor=(Monitor) xn1;
        System.out.println(monitor);
        DiscoDuro discoDuro=(DiscoDuro) xn2;
        System.out.println(discoDuro);

        Producto[] productos=new Producto[3];
        productos[0]=impresora;
        productos[1]=monitor;
        productos[2]=discoDuro;
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }*/
        //Interfaces
        Monitor lg1008=new Monitor("lg1008","Monitor LG 1008+",10,"HD");
        lg1008.reset();
        lg1008.estado();
        DiscoDuro s1000=new DiscoDuro("s1000","Samsung s1000",20,1000);
        s1000.reset();
        s1000.estado();
        Impresora e400=new Impresora("e400","Canon E400",4);
        e400.reset();
        e400.estado();
    }
}