package Taller4.Ejercicio1;

public class Estudiante {
    String nombre;
    int edad;
    float notaPromedio;

    public Estudiante(String nombre, int edad,float notaPromedio){
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    public void setNombre(String nombre){
        if(! nombre.isEmpty()){
            this.nombre = nombre;
        }else{
            this.nombre = "Nombre no valido";
        }
    }

    public void setEdad(int edad){
        if(edad > 0){
            this.edad = edad;
        }else{
            this.edad = 0;
        }
    }

    public void setNotaPromedio(float notaPromedio){
        if(notaPromedio >= 0 && notaPromedio <= 5){
            this.notaPromedio = notaPromedio;
        }else{
            this.notaPromedio = 0;
        }
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }

    public float getNotaPromedio(){
        return this.notaPromedio;
    }

    public void mostrarEstudiante(){
        System.out.println("Nombre: "+getNombre()+"\n"+
                "Edad: "+getEdad()+"\n"+
                "Nota Promedio: "+getNotaPromedio());
    }
}
