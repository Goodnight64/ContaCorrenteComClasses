import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos abrir sua conta");

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("digite seu Primeiro deposito: ");
        double deposito = entrada.nextDouble();

        Conta novaConta = new Conta();
        novaConta.nome = nome;
        novaConta.saldo = deposito;
        novaConta.agencia = 0111;
        novaConta.tipoDeConta = "corrente";

        System.out.println("sua conta foi criada com sucesso!!");
        int opcao = 0;

        System.out.println("*******************************"
                         + "\n nome:          " + novaConta.nome +
                           "\n saldo inicial: " + novaConta.saldo +
                           "\n tipo de conta: " + novaConta.tipoDeConta +
                           "\n********************************");

        while (opcao != 4){
            System.out.println("""
                    operações:
                    1 - consultar saldos
                    2 - receber valor
                    3 - transferir valor
                    4 - sair
                    
                    """);
            System.out.println("digite a opçao desejada: ");
            opcao = entrada.nextInt();

            if(opcao > 4 || opcao < 1){
                System.out.println("opçao errada cabaço, escolhe uma logo");
            }


            switch (opcao){
                case 1:
                    System.out.println("Seu saldo é:" + novaConta.saldo);
                    break;
                case 2 :
                    System.out.println("digite o valor a receber: ");
                    double valor = entrada.nextDouble();
                    novaConta.Depositar(valor);
                    System.out.println("seu novo saldo é:" + novaConta.saldo);
                    break;
                case 3 :
                    System.out.println("digite o valor a transferir: ");
                    double valor2 = entrada.nextDouble();
                    novaConta.Sacar(valor2);
                    System.out.println("seu novo saldo é:" + novaConta.saldo);
                    break;
            }


            }



        }





    }
