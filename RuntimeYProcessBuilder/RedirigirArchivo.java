package RuntimeYProcessBuilder;

import java.io.*;

public class RedirigirArchivo {
    public static void main(String[] args) {
        ProcessBuilder pb2 = new ProcessBuilder("cmd", "/c","dir");
        File archivo = new File("salida.txt");
        try {
            Process process = pb2.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            FileWriter fw = new FileWriter(archivo);
            String linea;
            while ((linea = br.readLine()) != null) {
                fw.write(linea + "\n");
                System.out.println(linea);

            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
