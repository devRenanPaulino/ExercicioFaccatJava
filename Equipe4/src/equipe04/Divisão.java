package equipe04;
import java.util.Scanner;

public class Divisão {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner (System.in);
		System.out.println("Operação Divisão");
		
		System.out.println("Digite o primeiro valor para a divisão: ");
		float numero1 = escaneia.nextFloat();
		System.out.println("Digite o segundo número para a divisão: ");
		float numero2 = escaneia.nextFloat();
		
		float resultado = numero1 / numero2;
		
		System.out.println("O resultado da divisão é: " + resultado);
	}
}
