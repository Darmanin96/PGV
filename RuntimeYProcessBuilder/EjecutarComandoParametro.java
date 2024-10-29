package RuntimeYProcessBuilder;

import java.io.*;

public class EjecutarComandoParametro {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "findstr \"volumen\" C:\\Users\\Dani-PC\\Documents\\GitHub\\PGV\\Directorio\\salida.txt");
            Process process = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
