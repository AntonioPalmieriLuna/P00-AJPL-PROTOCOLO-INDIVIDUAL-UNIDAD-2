package Taller5.Ejercicio2.Vehiculos;

public class prueba_instancias {
    static void main(){
        Vehiculo vehiculo = new Vehiculo();

        vehiculo.marca = "Toyota";
        vehiculo.modelo = "Corolla";
        vehiculo.fabricacion = 2022;
        vehiculo.color = "Rojo";
        vehiculo.mostrarinfo();

        Moto moto = new Moto();

        moto.marca = "Honda";
        moto.modelo = "CBR";
        moto.fabricacion = 2021;
        moto.color = "Negro";
        moto.velocidad = 100;
        moto.mostrarinfo();
    }
}
