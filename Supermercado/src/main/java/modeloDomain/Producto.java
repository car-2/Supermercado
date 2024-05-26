
package modeloDomain;


public class Producto {
    private String nombre;
    private int precio;
    private int tiempoProcesamiento; //tiempo en milisengundos.
    
    public Producto(String nombre, int precio, int tiempoProcesamiento){
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoProcesamiento = tiempoProcesamiento;
    
    }

   

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }
    
    
}
