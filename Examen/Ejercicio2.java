package Examen;

import java.sql.*;
import java.util.*;
import java.util.concurrent.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
        executor.scheduleAtFixedRate(() -> {
           System.out.println("Eliminado registros antiguos");
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("Eliminado registros antiguos");
        },0,5, TimeUnit.SECONDS);//Se ejecuta cada 5 segundos
        executor.scheduleAtFixedRate(() -> {
            System.out.println("Envieando informes");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Envieando informes");
        },0,2, TimeUnit.SECONDS);//Se ejecuta cada 2 segundos
        executor.scheduleAtFixedRate(() -> {
            System.out.println("Realizando copias de seguiridad");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Realizado copias de seguiridad");
        },0,7, TimeUnit.SECONDS);//Se ejecuta cada 7 segundos
    }
}
