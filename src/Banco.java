import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "João Pedro";
        String dados;
        String conta = "corrente";
        double saldo = 3000;
        double deposito;
        double seuDeposito;
        int opcoes = 0;
        Scanner ler = new Scanner(System.in);

        dados = String.format("""
                *******************************************************
                               Dados do Cliente:
               
                Nome:               %S
               
                Tipo de Conta:      %S
               
                Saldo Dísponivel:   %.2f
               
            
               ********************************************************
               """, nome, conta, saldo);
        System.out.println(dados);

        while(opcoes != 4){
            System.out.println("--------------Menu de Opções--------------");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Receber Deposito");
            System.out.println("3. Fazer um Pix");
            System.out.println("4. Sair");
            opcoes = ler.nextInt();

            if (opcoes == 1){
                System.out.println("Saldo Bancário: " + saldo);

            } else if (opcoes == 2){
                System.out.println("Qual o valor do Deposito que irá receber?");
                deposito = ler.nextDouble();
                System.out.println("Saldo atualizado para: " + ( deposito + saldo));
                saldo += deposito;

            } else if (opcoes == 3){
                System.out.println("Qual o valor que será seu Pix?");
                seuDeposito = ler.nextDouble();
                if (saldo < seuDeposito){
                    System.out.println("Saldo insuficiente para transferência!");
                } else {
                System.out.println("Saldo atualizado para: " + (saldo - seuDeposito));
                saldo -= seuDeposito;}

            } else if ( opcoes >= 5) {
                System.out.println("Digite uma das opções acima!");

            } else {
                System.out.println("Programa finzalizado!");
            }



        }


    }
}
