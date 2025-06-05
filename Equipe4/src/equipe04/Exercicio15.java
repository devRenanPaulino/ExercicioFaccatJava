package equipe04;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite um valor que te direi se ele é positivo ou negativo: ");
		float numero = escaneia.nextFloat();
		
		String mensagem = numero > 0 ? "É um número positivo" : numero < 0 ? "É um número negativo" : "É igual a zero";
		
		System.out.println(mensagem);
		
		escaneia.close();
	}
}
