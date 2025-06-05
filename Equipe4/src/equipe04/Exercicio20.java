package equipe04;
import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);

        System.out.println("Digite dois valores diferentes para ver em ordem crescente: ");

        System.out.print("Digite o primeiro valor: ");
        float valor1 = escaneia.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float valor2 = escaneia.nextFloat();

        if (valor1 == valor2) {
            System.out.println("Os valores não podem ser iguais.");
        } else if (valor1 < valor2) {
            System.out.printf("Ordem crescente: %.2f, %.2f%n", valor1, valor2);
        } else {
            System.out.printf("Ordem crescente: %.2f, %.2f%n", valor2, valor1);
        }

        escaneia.close();
	}
}
