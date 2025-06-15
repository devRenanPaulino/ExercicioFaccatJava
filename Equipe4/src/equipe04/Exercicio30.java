package equipe04;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio30 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o primeiro valor:");
	        int a = scanner.nextInt();

	        System.out.println("Digite o segundo valor:");
	        int b = scanner.nextInt();

	        System.out.println("Digite o terceiro valor:");
	        int c = scanner.nextInt();

	        // Coloca os valores em um array
	        int[] valores = {a, b, c};

	        // Ordena o array em ordem crescente
	        Arrays.sort(valores);

	        // Exibe os valores ordenados
	        System.out.println("Valores em ordem crescente:");
	        for (int valor : valores) {
	            System.out.println(valor);
	        }

	        scanner.close();
	    }	
}
