package Hilos;

import java.util.Random;

public class Carrera implements Runnable {

    private static volatile boolean carreraTerminada = false; // Variable compartida
    private int distancia;
    private String nombre; // Para identificar el vehículo

    public Carrera(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public static void main(String[] args) {
        Thread auto = new Thread(new Carrera("Auto", 1000));
        Thread moto = new Thread(new Carrera("Moto", 1000));
        Thread camion = new Thread(new Carrera("Camión", 1000));

        auto.start();
        moto.start();
        camion.start();
    }

    @Override
    public void run() {
        Random random = new Random();
        int distanciaRecorrida = 0;

        while (!carreraTerminada && distanciaRecorrida < distancia) {
            int avance = random.nextInt(10) + 1; // Avance aleatorio entre 1 y 10
            distanciaRecorrida += avance;

            System.out.println(nombre + " ha recorrido: " + distanciaRecorrida + " metros.");

            try {
                Thread.sleep(500); // Espera medio segundo antes de avanzar de nuevo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Comprobar si el vehículo ha terminado la carrera
            if (distanciaRecorrida >= distancia) {
                carreraTerminada = true; // Terminar la carrera
                System.out.println(nombre + " ha terminado la carrera!");
            }
        }

        // Mensaje final para indicar que el hilo ha terminado
        if (carreraTerminada) {
            System.out.println(nombre + " se detiene.");
        }
    }
}

