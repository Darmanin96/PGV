package Hilos;

public class Ejercicio02Contador implements Runnable {
    private  int contador=0;
    private String nombreHilo;
    private int limiteContador;


    public Ejercicio02Contador(int contador, int limiteContador, String nombreHilo) {
        this.contador = contador;
        this.limiteContador = limiteContador;
        this.nombreHilo = nombreHilo;
    }


    public static void main(String[] args) {
        Ejercicio02Contador hilo1 = new Ejercicio02Contador(0,10,"Hilo1");
        hilo1.run();

    }

    @Override
    public void run() {
        while (limiteContador > contador) {
            contador++;
            if (contador >= limiteContador) {
                System.out.println(nombreHilo);
                System.out.println("El contador es de" + contador);
            }
        }
    }
}
