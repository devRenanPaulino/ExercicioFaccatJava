package equipe04;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite um valor que te direi se ele � positivo ou negativo: ");
		float numero = escaneia.nextFloat();
		
		String mensagem = numero > 0 ? "� um n�mero positivo" : numero < 0 ? "� um n�mero negativo" : "� igual a zero";
		
		System.out.println(mensagem);
		
		escaneia.close();
	}
}
