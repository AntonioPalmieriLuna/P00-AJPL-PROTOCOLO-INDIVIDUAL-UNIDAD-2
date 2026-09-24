package Taller4.Ejercicio2;

public class InstanciaCoche {
    public static void main(String[] args) {
        Coche coche = new Coche("Honda","Civic",120);
        coche.mostarCoche();
        coche.setVelocidadMaxima(200);
        coche.mostarCoche();

        coche.setMarca("Renault");
        coche.mostarCoche();

        coche.setModelo("Clio-Campus");
        coche.mostarCoche();

        coche.setVelocidadMaxima(100);
        coche.mostarCoche();


    }
}
