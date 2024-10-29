package Hilos;

import java.util.Random;

public class DescargaFicheros implements Runnable {
    private String nombre;
    private int tamaño;

    public DescargaFicheros(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        try {
            Random random = new Random();
            int tamañoTotal = random.nextInt(1000) + 500;
            int tamañoDescargado = 0;

            while (tamañoDescargado < tamañoTotal) {
                int subir = random.nextInt(100) + 10;
                tamañoDescargado += subir;
                System.out.println(nombre + ": " + tamañoDescargado + " mb de " + tamañoTotal + " descargados");
                Thread.sleep(500);
            }

            System.out.println("La descarga de " + nombre + " ha finalizado");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DescargaFicheros hilo1 = new DescargaFicheros("Primero");
        DescargaFicheros hilo2 = new DescargaFicheros("Segundo");
        DescargaFicheros hilo3 = new DescargaFicheros("Tercero");

        Thread thread1 = new Thread(hilo1);
        Thread thread2 = new Thread(hilo2);
        Thread thread3 = new Thread(hilo3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
