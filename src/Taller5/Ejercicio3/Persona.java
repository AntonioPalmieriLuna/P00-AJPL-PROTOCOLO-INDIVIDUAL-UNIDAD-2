package Taller5.Ejercicio3;

public class Persona {
    private String nombre;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\n"+
                "Edad: "+edad+"\n");
    }
}
