package Hilos;

import java.util.*;

public class Corredor implements Runnable {
    private String nombre;
    private int velocidad;
    private static volatile boolean ganador=false;


    public Corredor(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Corredor corredor1 = new Corredor("Pepe",20);
        Corredor corredor2 = new Corredor("Paco",15);
        Corredor corredor3 = new Corredor("Papa",5);
        Thread thread1 = new Thread(corredor1);
        Thread thread2 = new Thread(corredor2);
        Thread thread3 = new Thread(corredor3);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        try {
        Random random = new Random();
        int distaciafinal = 1000;
        int distanciainicial =1;
            while (distaciafinal > distanciainicial && !ganador) {
                int suma = random.nextInt(100) + 1;
                distanciainicial += suma;
                System.out.println(nombre + " ha recorrido " + suma + " de/ " + distaciafinal + "m");
                Thread.sleep(1000);
                if (distanciainicial >= distaciafinal && !ganador){
                    System.out.println("El ganador de la carrera es: " + getNombre());
                    ganador=true;

                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
