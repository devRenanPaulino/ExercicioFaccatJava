package equipe04;
import java.util.Scanner;

public class NoMesmoPacote {
	
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Opera��o Soma");
		
		// pegando os valores da soma (Entrada)
		System.out.println("Digite um n�mero para a soma:");
		int numero1 = escaneia.nextInt(); // nextInt = "pr�ximo n�mero a entrar"
		System.out.println("Digite o segundo valor da soma:");
		int numero2 = escaneia.nextInt();
		
		// soma dois valores digitado (Processamento)
		int resultado = numero1 + numero2;
		
		// Sa�da
		System.out.println("O resultado da soma �: " + resultado);
	}
}
