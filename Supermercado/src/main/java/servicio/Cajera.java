
package servicio;

import modeloDomain.Cliente;
import modeloDomain.Producto;


public class Cajera implements Runnable {
    private String nombre;
    private Cliente cliente;

    public Cajera(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }
    
    @Override
    public void run(){
        System.out.println("Cajera " + nombre + " comienza a procesar al cliente " + cliente.getNombre());
        long tiempoInicial = System.currentTimeMillis();

        
        for (Producto producto : cliente.getProductos()){
            procesarProducto(producto);
        }
        
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Cajera " + nombre + " ha terminado de procesar al cliente " + cliente.getNombre() +
                           " en " + (tiempoFinal - tiempoInicial) + " milisegundos.");
    
    }
    private void procesarProducto(Producto producto) {
        System.out.println("Procesando el producto " + producto.getNombre() + " que cuesta " + producto.getPrecio());
        try {
            Thread.sleep(producto.getTiempoProcesamiento());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

        
        }        
    }
}