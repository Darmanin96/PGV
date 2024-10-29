package RuntimeYProcessBuilder;

import java.io.*;

public class CopiarYPegar {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "copy salida.txt Directorio");
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("Archivo copiado correctamente");
        }catch (IOException e){
            e.printStackTrace();
        }
    }



}
