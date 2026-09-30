package Taller5.Ejercicio1;

public class InstanciaProducto {
    static void main(){
        Producto producto1 = new Producto("Macarrones", 10000, 10);
        producto1.mostrarInfo();

        // se accede y modifica al atributo nombre y precio;
        producto1.nombre = "Arroz";
        producto1.precio = 15000;

        producto1.mostrarInfo();
    }
}
