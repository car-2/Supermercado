

package com.iudigital.supermercado;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import modeloDomain.Cliente;
import modeloDomain.Producto;
import servicio.Cajera;


public class Supermercado {

    public static void main(String[] args) {
        //se crea los productos
        Producto p1 = new Producto("Pan", 80, 500);
        Producto p2 = new Producto("Leche", 100,300);
        Producto p3 = new Producto("Huevos", 200,700);
        
        // se crea los clientes
        Cliente cliente1 = new Cliente("Cliente 1", Arrays.asList(p1, p2, p3));
        Cliente cliente2 = new Cliente("Cliente 2", Arrays.asList(p1, p2));
        Cliente cliente3 = new Cliente("Cliente 3", Arrays.asList(p3, p2));

        // se crea las cajeras
        Cajera cajera1 = new Cajera("Cajera 1", cliente1);
        Cajera cajera2 = new Cajera("Cajera 2", cliente2);
        Cajera cajera3 = new Cajera("Cajera 3", cliente3);

        // ejecuta proceso de cobro
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(cajera1);
        executor.execute(cajera2);
        executor.execute(cajera3);

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Esperar a que todos los hilos terminen
        }
        System.out.println("Todos los clientes han sido procesados.");
    }
}
