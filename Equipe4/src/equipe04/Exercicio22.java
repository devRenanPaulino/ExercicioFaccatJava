package equipe04;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.println("Calcular hora extra do funcionário");

        System.out.print("Digite o salário base do funcionário (para 160h mensais): R$ ");
        float salarioBase = escaneia.nextFloat();

        System.out.print("Digite o total de horas trabalhadas no mês: ");
        float horasTrabalhadas = escaneia.nextFloat();

        final int horasMensais = 160;
        float valorHora = salarioBase / horasMensais;
        float horasExtras = horasTrabalhadas - horasMensais;

        // Cálculo do salário com ternário:
        float salarioTotal = horasExtras > 0
            ? salarioBase + (horasExtras * valorHora * 1.5f)
            : salarioBase;

        System.out.printf("O salário total é de R$: %.2f%n", salarioTotal);

        escaneia.close();
    }
}