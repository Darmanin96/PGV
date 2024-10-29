package Examen;

import java.util.*;
import java.util.concurrent.*;

public class Ejercicio3 implements Runnable {
    public static void main(String[] args) {
        Random rand = new Random();
        int solicitudes = rand.nextInt(20) + 5;
        Executor executor = Executors.newFixedThreadPool(solicitudes);
        executor.execute(() -> {
           System.out.println("Recibiendo peticiones");
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        });
    }

    @Override
    public void run() {

    }
}
