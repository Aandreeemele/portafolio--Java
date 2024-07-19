package Compras;
import java.util.ArrayList;
import java.util.Scanner;

class Producto {
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        nombre = nombre;
        precio = precio;
    }

    String getNombre() {
        return nombre;
    }

    double getPrecio() {
        return precio;
    }

    public String mostrar() {
        return nombre + " - $" + precio;
    }
}

class Compra {
    Producto producto;
    int cantidad;

    Compra(Producto p, int c) {
        producto = p;
        cantidad = c;
    }

    Producto getProducto() {
        return producto;
    }

    int getCantidad() {
        return cantidad;
    }

    public String mostrar() {
        return producto.getNombre() + " x " + cantidad + " - $" + (producto.getPrecio() * cantidad);
    }
}

public class ListaCompras {
    public static void Compra() {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto("Manzana", 0.50));
        productos.add(new Producto("Banana", 0.30));
        productos.add(new Producto("Naranja", 0.60));
        productos.add(new Producto("Leche", 1.20));
        productos.add(new Producto("Pan", 0.50));
        productos.add(new Producto("Avena", 2.50));
        productos.add(new Producto("Jamon", 5.30));
        productos.add(new Producto("Fresa", 0.60));
        productos.add(new Producto("Melón", 5.20));
        productos.add(new Producto("Pollo", 12.00));

        ArrayList<Compra> compras = new ArrayList<Compra>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        System.out.println("Lista de productos disponibles:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i).mostrar());
        }

        while (true) {
            System.out.println("\nElige el número del producto que deseas comprar (o 'salir' para terminar):");
            opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("salir")) {
                break;
            }

            int numeroProducto = Integer.parseInt(opcion) - 1;
            if (numeroProducto >= 0 && numeroProducto < productos.size()) {
                Producto productoSeleccionado = productos.get(numeroProducto);

                System.out.println("¿Cuántos deseas comprar?");
                int cantidad = Integer.parseInt(scanner.nextLine());

                compras.add(new Compra(productoSeleccionado, cantidad));
            } else {
                System.out.println("Número de producto no válido.");
            }
        }

        System.out.println("\nTu lista de compras:");
        for (Compra compra : compras) {
            System.out.println(compra.mostrar());
        }

        scanner.close();
    }
}
