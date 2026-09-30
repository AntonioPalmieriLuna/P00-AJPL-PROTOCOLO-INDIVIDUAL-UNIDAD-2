package Taller4.Ejercicio3;

public class InstanciaPersona {
 public static void main(String[] args) {
//        Persona persona = new Persona("Juan");
//        persona.nombre = "Pedro";
//        System.out.println(persona.nombre);

     // error de compilación porque el atributo es privado

     Persona persona = new Persona("Juan",20);
     persona.mostrarPersona();

     Persona persona2=new Persona("",-25);
     persona2.mostrarPersona();
    }


}
