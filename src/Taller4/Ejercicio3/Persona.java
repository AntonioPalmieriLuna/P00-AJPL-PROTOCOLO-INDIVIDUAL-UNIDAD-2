package Taller4.Ejercicio3;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre,int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarPersona(){
        System.out.println("Nombre: " + nombre+"\n"+
                "Edad: "+edad+"\n");
    }
}
