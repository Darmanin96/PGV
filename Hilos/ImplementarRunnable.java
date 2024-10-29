package Hilos;

import java.util.*;

public class ImplementarRunnable implements Runnable {
    private String mensaje;

    public ImplementarRunnable(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir mensaje");
        String mensaje = sc.next();
        ImplementarRunnable hilo1 = new ImplementarRunnable(mensaje);
        hilo1.run();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("El mensaje es: ");
            System.out.println(mensaje);
        }
    }
}
