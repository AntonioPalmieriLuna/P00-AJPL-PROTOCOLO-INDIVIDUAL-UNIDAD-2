package Taller6.Ejercicio2.PruebaPaquetes;

import Taller6.Ejercicio2.Vehiculos.Moto;

public class prueba_errada {
    static void main(){
        Moto moto = new Moto();

        // esta clase no hereda de Vehiculo ni esta en el mismo paquete,
        // por eso no puede tocar los atributos protected, si se quitan los // da error de compilacion
        //moto.tipo = "Deportiva";
        //moto.marca = "Yamaha";
        //moto.cilindrada = 600;

        // el metodo si es public, entonces ese si se puede usar
        moto.mostrarInfo();

        // protected deja usar el atributo a las clases hijas y a las del mismo paquete,
        // pero una clase de otro paquete que no tiene nada que ver con Vehiculo no lo puede ver.
    }
}
