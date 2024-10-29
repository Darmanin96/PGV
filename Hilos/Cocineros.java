package Hilos;

import java.io.*;
import java.util.*;

public class Cocineros implements Runnable {

    private String nombre;
    private int numero;
    private int pedido;

    public Cocineros(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.pedido = pedido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cocineros cocinero1 = new Cocineros("Pepe",1);
        Cocineros cocinero2 = new Cocineros("Papa",2);
        Cocineros cocinero3 = new Cocineros("Pepa",3);
        Cocineros cocinero4 = new Cocineros("Pipu",4);
        cocinero1.run();
        cocinero2.run();
        cocinero3.run();
        cocinero4.run();


    }
    @Override
    public void run() {
        try {
            int pedidos=16;
            Random r = new Random();
            int totalTiempo = r.nextInt(1000)+ 100;
            int tiempo = 0;
            for (int i = 0; i < pedidos; i++) {
                while (totalTiempo > tiempo) {
                    tiempo++;
                    System.out.println("El " + nombre + nombre+ " ha cogido el pedido " + pedido);
                    Thread.sleep(1000);
                    if (tiempo > totalTiempo){
                        System.out.println("El " + nombre + numero + " ha tardado  con el pedido " + pedidos + tiempo );
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
