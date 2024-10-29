package RuntimeYProcessBuilder;

import java.io.*;

public class MultiplesComandos {

    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "mkdir Directorio");
            ProcessBuilder pb2 = new ProcessBuilder("cmd", "/c", "cd Directorio && dir");
            Process process = pb.start();
            process.waitFor();
            System.out.println("Directorio creado.");
            Process process2 = pb2.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(process2.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
