package RuntimeYProcessBuilder;

import java.io.*;

public class ComandoSimple {

    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c","date /t");
        ProcessBuilder pb2 = new ProcessBuilder("cmd", "/c","dir");
        try {
            Process process = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            Process process2 = pb2.start();
            BufferedReader br2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
            while ((linea = br2.readLine()) != null) {
                System.out.println(linea);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

