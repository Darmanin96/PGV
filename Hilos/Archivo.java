package Hilos;

import java.util.*;

public class Archivo implements Runnable {

    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Archivo hilo1 = new Archivo("Primero");
        Archivo hilo2 = new Archivo("Segundo");
        Archivo hilo3 = new Archivo("Tercero");
        hilo1.run();
        hilo2.run();
        hilo3.run();
    }


    @Override
    public void run() {
        synchronized (this) {
            try {
                int contador = 0;
                int maximo =1000;
                while (maximo > contador) {
                    Random r = new Random();
                    int suma = r.nextInt(20) + 1;
                    contador+=suma;
                    System.out.println(nombre + " contador " + contador);
                    Thread.sleep(1000);
                    if (maximo >= contador) {
                        System.out.println(nombre + " contador " + maximo);
                    }
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}