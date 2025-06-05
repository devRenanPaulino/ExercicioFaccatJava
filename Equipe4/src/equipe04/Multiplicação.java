package equipe04;
import java.util.Scanner; 

public class Multiplicação {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Operação Multiplicação");
		
		System.out.println("Digite o primeiro número para multiplicação: ");
		int numero1 = escaneia.nextInt();
		System.out.println("Digite o segundo número para a multiplicação: ");
		int numero2 = escaneia.nextInt();
		
		int resultado = numero1 * numero2;
		
		System.out.println("O resultado da multiplicação é: " + resultado);
	}
}
