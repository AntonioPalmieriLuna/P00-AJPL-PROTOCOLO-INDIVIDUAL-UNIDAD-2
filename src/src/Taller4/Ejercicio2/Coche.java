package Taller4.Ejercicio2;

public class Coche {
    private String marca,modelo;
    private float velocidadMaxima;

    public Coche(String marca, String modelo, float velocidadMaxima) {
        setMarca(marca);
        setModelo(modelo);
        setVelocidadMaxima(velocidadMaxima);
    }

    public void setMarca(String marca) {
        if(marca != null && !marca.isEmpty()){
            this.marca = marca;
        }else{
            this.marca="Marca invalida";
        }
    }
    public void setModelo(String modelo) {
        if(modelo != null && !modelo.isEmpty()){
            this.modelo = modelo;
        }else{
            this.modelo="Modelo invalido";
        }
    }
    public void setVelocidadMaxima(float velocidadMaxima) {
        if(velocidadMaxima > 0){
            this.velocidadMaxima = velocidadMaxima;
        }else{
            this.velocidadMaxima = 0;
        }
    }

    public void mostarCoche(){
        System.out.println("Marca: "+marca+"\n"+
                "Modelo: "+modelo+"\n"+
                "Velocidad maxima: "+velocidadMaxima+"\n");
    }

}
