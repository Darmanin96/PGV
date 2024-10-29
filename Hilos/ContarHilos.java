package Hilos;

public class ContarHilos {
    public static void main(String[] args) {
        Arriba acendente = new Arriba();
        Abajo descendente = new Abajo();
        Thread t1 = new Thread(acendente);
        Thread t2 = new Thread(descendente);
        t1.start();
        t2.start();
    }


    static class Arriba implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }

    static class Abajo implements Runnable {
        @Override
        public void run() {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
        }
    }
}
