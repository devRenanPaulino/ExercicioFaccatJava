package equipe04;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.println("Digite o salário fixo do funcionário: ");
        float salarioFixo = escaneia.nextFloat();

        System.out.println("Digite o total de vendas efetuadas pelo funcionário: ");
        float totalVenda = escaneia.nextFloat();

        float comissao = totalVenda <= 1500
            ? totalVenda * 0.03f
            : (1500 * 0.03f) + ((totalVenda - 1500) * 0.05f);

        float salarioTotal = salarioFixo + comissao;

        System.out.printf("Total a receber: R$ %.2f%n", salarioTotal);

        escaneia.close();
    }
}