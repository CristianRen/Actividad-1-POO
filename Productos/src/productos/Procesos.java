package productos;

import java.util.ArrayList;
import java.util.Scanner;

public class Procesos extends Productos {
    private ArrayList<Productos> listaProductos = new ArrayList<>();

  
    public Procesos() {
        super("", 0, 0); 
    }

    public void menu() {
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("   | Menu de opciones |");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
     
            opcion = in.nextInt();
            in.nextLine(); 

            switch (opcion) {
                case 1:
                    agregar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    System.out.println("Vuelva pronto");
                    System.exit(0); 
                    break;
            }
        } while (true);
    }

   
    public void agregar() {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Agrega el nombre: ");
        String nombre = in.nextLine();

        System.out.println("Agrega la cantidad: ");
        int cantidad = in.nextInt();

        System.out.println("Agrega el precio: ");
        int precio = in.nextInt();

        Productos nuevoP = new Productos(nombre, cantidad, precio);

        listaProductos.add(nuevoP);

        System.out.println("Producto agregado.");
    }

    public void mostrar() {
        
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos agregados");
        } else {
            System.out.println("  | Lista de Productos | ");
            for (Productos producto : listaProductos) {
                System.out.println("Nombre: " + producto.getNombre() +
                                   ", Cantidad: " + producto.getCantidad() +
                                   ", Precio: $" + producto.getPrecio());
            }
        }
    }
}
