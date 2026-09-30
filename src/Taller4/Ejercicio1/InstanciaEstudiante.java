package Taller4.Ejercicio1;

public class InstanciaEstudiante {
    static void main() {
        Estudiante estudiante1 = new Estudiante("", 20, 4.5f);
        estudiante1.mostrarEstudiante();

        System.out.println("\n");
        System.out.println("Prueba de setters");

        estudiante1.setNombre("Pedro");
        estudiante1.mostrarEstudiante();
        System.out.println("\n");

        estudiante1.setEdad(18);
        estudiante1.mostrarEstudiante();
        System.out.println("\n");

        estudiante1.setNotaPromedio(4.8f);
        estudiante1.mostrarEstudiante();
    }
}
