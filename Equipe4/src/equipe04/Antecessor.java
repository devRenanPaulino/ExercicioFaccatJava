package equipe04;
import java.util.Scanner;

public class Antecessor {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro que direi seu antecessor: ");
		int numero = escaneia.nextInt();
		
		int antecessor = numero - 1;
		
		System.out.println("O n�mero antecessor �: " + antecessor);
	}
}
