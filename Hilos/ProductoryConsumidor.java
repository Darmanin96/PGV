package Hilos;

import java.util.*;

public class ProductoryConsumidor {

    private List<ProductoryConsumidor> list;

    public ProductoryConsumidor(List<ProductoryConsumidor> list) {
        this.list = list;
    }

    public List<ProductoryConsumidor> getList() {
        return list;
    }

    public void setList(List<ProductoryConsumidor> list) {
        this.list = list;
    }

    public static void main(String[] args) {

    }


}

class Consumidor implements Runnable {
    @Override
    public void run() {

    }
}

class Productor implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        int aleatorio = random.nextInt(10);

    }
}
