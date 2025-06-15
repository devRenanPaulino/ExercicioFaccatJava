package equipe04;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.println("Digite o n�mero da conta: ");
        int conta = escaneia.nextInt();
        System.out.println("Digite o saldo da sua conta: ");
        float saldo = escaneia.nextFloat();
        System.out.println("Digite o valor do d�bito na sua conta: ");
        float debito = escaneia.nextFloat();
        System.out.println("Digite o valor do cr�dito da sua conta: ");
        float credito = escaneia.nextFloat();

        float saldoAtual = saldo - debito + credito;

        String valorSaldo = saldoAtual < 0 ? "O saldo � negativo." : "O saldo � positivo.";

        System.out.printf("Conta n� %d%n", conta);
        System.out.printf("Saldo Atual: R$ %.2f%n", saldoAtual);
        System.out.println(valorSaldo);

        escaneia.close();
    }
}