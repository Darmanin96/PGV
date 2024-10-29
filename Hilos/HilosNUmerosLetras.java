package Hilos;

import java.util.*;

public class HilosNUmerosLetras implements  Runnable {
    private int tipo;


    public HilosNUmerosLetras(int tipo) {
        this.tipo = tipo;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca que hilo desea correr");
        int opcion = sc.nextInt();
        HilosNUmerosLetras hilos = new HilosNUmerosLetras(opcion);
        hilos.run();
    }


    @Override
    public void run() {
            if(tipo == 1){
                System.out.println("Números del 1 al 30");
                for (int i =1; i<=30; i++){
                    System.out.println(i);
                }
            }    else {
                    System.out.println("Letras de la a hasta la z");
                    for (char letra = 'a'; letra <= 'z'; letra++){
                        System.out.println(letra);
                    }
            }
    }
}
