package Taller5.Ejercicio2.Vehiculos;

public class Moto extends Vehiculo{
    int velocidad;

    @Override
    public void mostrarinfo(){
        System.out.println("Marca: "+marca+"\n"+
                "Velocidad: "+velocidad);
    }

}
