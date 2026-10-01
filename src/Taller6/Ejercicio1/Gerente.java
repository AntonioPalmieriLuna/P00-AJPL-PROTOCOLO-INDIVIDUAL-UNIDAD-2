package Taller6.Ejercicio1;

public class Gerente extends Empleado{
    String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    // como nombre y salario son protected, el Gerente los puede usar directo porque hereda de Empleado
    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre+"\n"+
                "Salario: "+salario+"\n"+
                "Departamento: "+departamento+"\n");
    }
}
