package Taller6.Ejercicio3;

public class prueba_banco {
    static void main(){
        Banco banco = new Banco();

        // como saldo es protected y estamos en el mismo paquete, se puede cambiar directo sin control
        banco.saldo = -500000;
        banco.mostrarSaldo();

        BancoSeguro bancoSeguro = new BancoSeguro();

        // aqui el saldo es private, si se intenta cambiar directo da error
        //bancoSeguro.saldo = -500000;

        // toca usar los metodos, y ellos revisan que el valor tenga sentido
        bancoSeguro.depositar(100000);
        bancoSeguro.retirar(300000);
        bancoSeguro.depositar(-2000);
        bancoSeguro.mostrarSaldo();
    }
}
