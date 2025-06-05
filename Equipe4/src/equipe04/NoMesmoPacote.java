package equipe04;
import java.util.Scanner;

public class NoMesmoPacote {
	
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Operação Soma");
		
		// pegando os valores da soma (Entrada)
		System.out.println("Digite um número para a soma:");
		int numero1 = escaneia.nextInt(); // nextInt = "próximo número a entrar"
		System.out.println("Digite o segundo valor da soma:");
		int numero2 = escaneia.nextInt();
		
		// soma dois valores digitado (Processamento)
		int resultado = numero1 + numero2;
		
		// Saída
		System.out.println("O resultado da soma é: " + resultado);
	}
}
