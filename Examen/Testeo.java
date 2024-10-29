package Examen;

import java.util.*;
import java.util.concurrent.*;

public class Testeo extends Thread {

    public static void main(String[] args) throws  Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tareas = Arrays.asList(
                () -> "Primera tarea",
                () -> "Segunda tarea",
                () -> "Tercera tarea"
        );
        String resultado = executor.invokeAny(tareas);
        System.out.println("Resultado"  + resultado);
        executor.shutdown();
    }
}
