package Taller6.Ejercicio1;

public class prueba_empleado {
    static void main(){
        Empleado empleado = new Empleado("Carlos", 2500000);
        empleado.mostrarInformacion();

        Gerente gerente = new Gerente("Laura", 6000000, "Ventas");
        gerente.mostrarInformacion();
    }
}
