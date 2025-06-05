package equipe04;
import java.util.Scanner;


public class Subtracao {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("operação subtração");
		
		System.out.println("Digite o primeiro número para subtração: ");
		int numero1 = escaneia.nextInt();
		System.out.println("Digite o segundo valor da soma:");
		int numero2 = escaneia.nextInt();
		
		int resultado = numero1 - numero2;
		
		System.out.println("O resultado da subtração é: " + resultado);
	}
}
