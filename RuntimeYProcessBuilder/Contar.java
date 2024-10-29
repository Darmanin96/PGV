package RuntimeYProcessBuilder;

import java.io.*;

public class Contar {

    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "ping 8.8.8.8");
            Process process = pb.start();
            int contador=0;
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                if (linea.contains("Respuesta")) {
                    contador++;
                }
            }
            System.out.println("Las veces que hay la palabra Respuesta es de: " + contador);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
