package equipe04;
import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Descubra qual é o maior valor: ");
		
		System.out.println("Digite o primeiro valor: ");
		float numero1 = escaneia.nextFloat();
		System.out.println("Digite o segundo valor: ");
		float numero2 = escaneia.nextFloat();
		
		float maior = (float) numero1 > numero2 ? numero1 : numero2; 
		
		System.out.printf("O maior valor é: %.2f%n", maior);

        escaneia.close();
	}
}
