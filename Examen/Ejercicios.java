package Examen;

import java.util.Random;

public class Ejercicios implements Runnable {

    private String nombre;
    private static String ganador; // Variable estática para guardar el nombre del ganador
    private static final Object lock = new Object(); // Objeto para sincronización

    public Ejercicios(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Ejercicios("Corredor 1"));
        Thread hilo2 = new Thread(new Ejercicios("Corredor 2"));
        Thread hilo3 = new Thread(new Ejercicios("Corredor 3"));

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

    @Override
    public void run() {
        Random random = new Random();
        int meta = 1500;
        int correr = 0; // Distancia total corrida por el corredor

        while (correr < meta) {
            int distancia = random.nextInt(100) + 50; // Distancia que el corredor correrá en esta iteración
            correr += distancia; // Aumentar la distancia total corrida

            // Imprimir la distancia corrida por el corredor
            System.out.println("El corredor " + getNombre() + " ha corrido: " + correr);

            // Verificar si el corredor ha alcanzado la meta
            if (correr >= meta) {
                synchronized (lock) { // Sincronizar el bloque
                    if (ganador == null) { // Solo un ganador
                        ganador = getNombre();
                        System.out.println("El corredor " + ganador + " ha ganado la carrera");
                    }
                }
                break; // Terminar el hilo si el corredor gana
            }

            // Pausa para simular el tiempo de carrera
            try {
                Thread.sleep(500); // Pausa de 500 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
