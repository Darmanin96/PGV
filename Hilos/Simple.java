package Hilos;

public class Simple extends Thread {
    public static void main(String[] args) {
        Simple hilo1 = new Simple();
        hilo1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola");
        }
    }
}
