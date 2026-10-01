package Taller6.Ejercicio2.Vehiculos;

public class Moto extends Vehiculo{
    protected int cilindrada;

    @Override
    public void mostrarInfo(){
        System.out.println("Tipo: "+tipo+"\n"+
                "Marca: "+marca+"\n"+
                "Cilindrada: "+cilindrada+"\n");
    }
}
