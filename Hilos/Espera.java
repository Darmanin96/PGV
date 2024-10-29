package Hilos;

public class Espera implements Runnable{
    public static void main(String[] args) {
        Espera e = new Espera();
        e.run();

    }
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
