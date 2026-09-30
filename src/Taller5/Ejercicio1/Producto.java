package Taller5.Ejercicio1;

public class Producto {
    String nombre;
    int precio;
    int stock;

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+
                "\nPrecio: "+precio+
                "\nStock: "+stock+"\n");
    }
}
