package Hilos;

import java.util.*;

public class SincronizacionBasica implements Runnable {
    private int variable;

    public SincronizacionBasica(int variable) {
        this.variable = variable;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduicir variable");
        int variable = sc.nextInt();
        SincronizacionBasica hilo  = new SincronizacionBasica(variable);
        SincronizacionBasica hilo2 = new SincronizacionBasica(variable);
        hilo.run();
        hilo2.run();
    }


    @Override
    public void run() {
        synchronized (SincronizacionBasica.class) {
            int incrementar = 1000;
            incrementar+=variable;
            System.out.println(incrementar);
        }
    }
}
