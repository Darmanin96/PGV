package Hilos;

public class HilosSeparados {

    public static void main(String[] args) {
        // Crear objetos Runnable para pares e impares
        ContarPares contarPares = new ContarPares();
        ContarImpares contarImpares = new ContarImpares();

        // Crear hilos con los objetos Runnable
        Thread hiloPar = new Thread(contarPares);
        Thread hiloImpar = new Thread(contarImpares);

        // Iniciar ambos hilos
        hiloPar.start();
        hiloImpar.start();
    }
}

class ContarPares implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Par: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ContarImpares implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Impar: " + i);
            try {
                Thread.sleep(1000);  // Espera de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
