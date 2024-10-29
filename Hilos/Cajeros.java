package Hilos;

import java.util.*;

public class Cajeros implements Runnable {

    private int cuneta;

    public Cajeros() {
        this.cuneta = 1500;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread t1 = new Thread(new Cajeros());
        Thread t2 = new Thread(new Cajeros());
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        try {
            int retirar=15;
            while (retirar< cuneta){
                retirar+=10;
                int saldototal = cuneta-retirar;
                System.out.println("Se ha retirado " + retirar + " de la cuenta " + " queda: " + saldototal);
                Thread.sleep(1000);
                if (retirar>cuneta){
                    System.out.println("El dinero se ha retirado completamemte" + cuneta);
                    break;
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
