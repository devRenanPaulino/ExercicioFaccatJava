package equipe04;
import java.util.Scanner;

public class Divis�o {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner (System.in);
		System.out.println("Opera��o Divis�o");
		
		System.out.println("Digite o primeiro valor para a divis�o: ");
		float numero1 = escaneia.nextFloat();
		System.out.println("Digite o segundo n�mero para a divis�o: ");
		float numero2 = escaneia.nextFloat();
		
		float resultado = numero1 / numero2;
		
		System.out.println("O resultado da divis�o �: " + resultado);
	}
}
