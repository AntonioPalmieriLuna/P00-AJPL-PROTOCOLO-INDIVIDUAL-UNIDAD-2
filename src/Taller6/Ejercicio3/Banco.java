package Taller6.Ejercicio3;

public class Banco {
    protected double saldo;

    public void mostrarSaldo(){
        System.out.println("Saldo: "+saldo+"\n");
    }

    // Por que esto no es seguro:
    // - Al ser protected, cualquier clase del mismo paquete o cualquier clase que herede de Banco
    //   puede cambiar el saldo directo, sin pasar por ningun control.
    // - Por ejemplo alguien podria poner el saldo en negativo o subirlo a un millon sin depositar nada.
    // - Ademas cualquiera puede crear una clase hija de Banco solo para meterse con el saldo.
    // Como se podria mejorar:
    // - Poner el saldo como private para que solo la clase lo pueda tocar.
    // - Hacer metodos como depositar y retirar que revisen que los valores sean correctos antes de cambiar el saldo.
}
