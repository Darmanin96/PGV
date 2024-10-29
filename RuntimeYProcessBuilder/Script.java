package RuntimeYProcessBuilder;

import java.io.*;

public class Script {

    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("wsl", "./script.sh");
            Process process = pb.start();
            String linea;
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
