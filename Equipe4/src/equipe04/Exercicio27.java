package equipe04;
import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite um valor e te direi se  é positivo ou negativo: ");
		float numero = escaneia.nextFloat();
		
		String valor = numero >= 0 ? "O número é positivo!" : "O número é negativo!";
		
		System.out.printf("O número %.2f é %s", numero, valor);
		
		escaneia.close();
	}

}
