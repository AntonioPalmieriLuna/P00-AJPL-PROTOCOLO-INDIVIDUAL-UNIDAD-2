package Taller5.Ejercicio3;

public class prueba_persona {
    static void main(){
        Persona persona = new Persona();

        // edad es de paquete, como estamos en el mismo paquete se puede usar directo
        persona.edad = 20;

        // nombre es privado, si se intenta usar directo da error
        //persona.nombre = "Antonio";

        // por eso toca usar el set y el get para poder darle valor y leerlo
        persona.setNombre("Antonio");
        System.out.println("Nombre con get: "+persona.getNombre());
        System.out.println("Edad directa: "+persona.edad+"\n");

        persona.mostrarInfo();

        // Diferencias entre private y de paquete:
        // - El atributo private (nombre) solo se puede usar dentro de la misma clase Persona,
        //   ni siquiera otra clase del mismo paquete lo puede tocar, por eso hay que usar get y set.
        // - El atributo de paquete (edad) no tiene ningun modificador, y cualquier clase que este
        //   en el mismo paquete lo puede leer y cambiar directo, como se hizo aqui con persona.edad.
        // - Si esta clase de prueba estuviera en otro paquete, edad tampoco se podria usar,
        //   como paso en el ejercicio 2 con prueba_errada.
        // - Con private se protege mejor el dato, porque en el set se podria validar lo que entra,
        //   en cambio con el de paquete le pueden poner cualquier valor, por ejemplo una edad negativa.
    }
}
