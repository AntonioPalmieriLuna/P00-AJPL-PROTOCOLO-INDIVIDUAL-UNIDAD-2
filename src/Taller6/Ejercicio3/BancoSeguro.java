package Taller6.Ejercicio3;

public class BancoSeguro {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if(cantidad > 0){
            saldo = saldo + cantidad;
        }else{
            System.out.println("Cantidad invalida para depositar");
        }
    }

    public void retirar(double cantidad) {
        if(cantidad > 0 && cantidad <= saldo){
            saldo = saldo - cantidad;
        }else{
            System.out.println("No se puede retirar esa cantidad");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo: "+saldo+"\n");
    }
}
