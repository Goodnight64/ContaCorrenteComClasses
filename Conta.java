public class Conta {
    String nome;
    String tipoDeConta;
    double saldo;
    double agencia;

    void Depositar(double valor){
        saldo = saldo + valor;

    }


    void Sacar(double valor){
        saldo = saldo - valor;

    }

}



