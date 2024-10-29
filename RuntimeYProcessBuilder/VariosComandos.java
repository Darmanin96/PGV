package RuntimeYProcessBuilder;

import java.io.*;

public class VariosComandos {

    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir");
        ProcessBuilder pb2 = new ProcessBuilder("cmd", "/c", "ls");
        try {
            Process process = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            Thread.sleep(1000);
            Process process2 = pb2.start();
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
            while ((line = reader2.readLine()) != null) {
                System.out.println(line);
            }

        }catch (IOException ex){
            ex.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
