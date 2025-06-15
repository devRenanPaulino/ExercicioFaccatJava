package equipe04;
import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor (inteiro): ");
		int numero1 = escaneia.nextInt();
		System.out.println("Digite o segundo valor (inteiro): ");
		int numero2 = escaneia.nextInt();
		System.out.println("Digite o terceiro valor (inteiro): ");
		int numero3 = escaneia.nextInt();
		
		int valorMaior = (numero1 > numero2 && numero1 > numero3) ? numero1 : (numero2 > numero3 ? numero2 : numero3);
		
		System.out.println("O maior valor é: " + valorMaior);
		
		escaneia.close();
	}
}
