package equipe04;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.println("Calcular hora extra do funcion�rio");

        System.out.print("Digite o sal�rio base do funcion�rio (para 160h mensais): R$ ");
        float salarioBase = escaneia.nextFloat();

        System.out.print("Digite o total de horas trabalhadas no m�s: ");
        float horasTrabalhadas = escaneia.nextFloat();

        final int horasMensais = 160;
        float valorHora = salarioBase / horasMensais;
        float horasExtras = horasTrabalhadas - horasMensais;

        // C�lculo do sal�rio com tern�rio:
        float salarioTotal = horasExtras > 0
            ? salarioBase + (horasExtras * valorHora * 1.5f)
            : salarioBase;

        System.out.printf("O sal�rio total � de R$: %.2f%n", salarioTotal);

        escaneia.close();
    }
}