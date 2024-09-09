package productos;

public class Productos {
    private String nombre;
    private int cantidad;
    private int precio;

    public Productos(String nombre, int cantidad, int precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
