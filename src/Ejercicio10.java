import java.util.ArrayList;

public class Ejercicio10 {

    public static class Producto {
        String nombre;
        double precio;
        int cantidad;

        Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }
    }

    public static void agregarProducto(ArrayList<Producto> productos, String nombre, double precio, int cantidad) {
        productos.add(new Producto(nombre, precio, cantidad));
    }

    public static double calcularValorTotalInventario(ArrayList<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total = total + (producto.precio * producto.cantidad);
        }
        return total;
    }

    public static void mostrarInventario(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.nombre + " | Precio: " + producto.precio + " | Cantidad: " + producto.cantidad);
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<Producto>();

        agregarProducto(productos, "Lapiz", 1.50, 50);
        agregarProducto(productos, "Cuaderno", 2.75, 30);
        agregarProducto(productos, "Borrador", 0.90, 20);

        mostrarInventario(productos);
        System.out.println("Valor total: " + calcularValorTotalInventario(productos));
    }
}