package equipe04;
import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite um valor e te direi se  � positivo ou negativo: ");
		float numero = escaneia.nextFloat();
		
		String valor = numero >= 0 ? "O n�mero � positivo!" : "O n�mero � negativo!";
		
		System.out.printf("O n�mero %.2f � %s", numero, valor);
		
		escaneia.close();
	}

}
