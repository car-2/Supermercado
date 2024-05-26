
package modeloDomain;

import java.util.List;


public class Cliente {
    private String nombre;
    private List<Producto> Productos;

    public Cliente(String nombre, List<Producto> Productos) {
        this.nombre = nombre;
        this.Productos = Productos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return Productos;
    }
    
    
}
