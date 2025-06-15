package equipe04;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int conta = escaneia.nextInt();
        System.out.println("Digite o saldo da sua conta: ");
        float saldo = escaneia.nextFloat();
        System.out.println("Digite o valor do débito na sua conta: ");
        float debito = escaneia.nextFloat();
        System.out.println("Digite o valor do crédito da sua conta: ");
        float credito = escaneia.nextFloat();

        float saldoAtual = saldo - debito + credito;

        String valorSaldo = saldoAtual < 0 ? "O saldo é negativo." : "O saldo é positivo.";

        System.out.printf("Conta nº %d%n", conta);
        System.out.printf("Saldo Atual: R$ %.2f%n", saldoAtual);
        System.out.println(valorSaldo);

        escaneia.close();
    }
}