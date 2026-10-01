package Taller6.Ejercicio2.Vehiculos;

public class Vehiculo {
    protected String tipo;
    protected String marca;

    public void mostrarInfo(){
        System.out.println("Tipo: "+tipo+"\n"+
                "Marca: "+marca+"\n");
    }
}
