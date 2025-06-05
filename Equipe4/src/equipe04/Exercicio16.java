package equipe04;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		float unidademaca = (float) 1.30;
		float duziamaca = (float) 1;
		
		System.out.println("Quitanda Java");
		System.out.println("Unidade R$ 1,30 a partir da dúzia a unidade por R$ 1,00");
		System.out.println("Quantas maça você vai levar? ");
		int totalmaca = escaneia.nextInt();
		
		float valorTotal = totalmaca < 12 ? totalmaca * unidademaca : totalmaca * duziamaca;
		
		System.out.printf("%nO total de maças compradas é: %d %n", totalmaca);
		System.out.printf("O valor total da compra é: R$ %.2f%n", valorTotal);

        escaneia.close();
		
		
	}
}
