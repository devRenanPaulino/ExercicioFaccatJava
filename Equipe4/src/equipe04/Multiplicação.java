package equipe04;
import java.util.Scanner; 

public class Multiplica��o {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Opera��o Multiplica��o");
		
		System.out.println("Digite o primeiro n�mero para multiplica��o: ");
		int numero1 = escaneia.nextInt();
		System.out.println("Digite o segundo n�mero para a multiplica��o: ");
		int numero2 = escaneia.nextInt();
		
		int resultado = numero1 * numero2;
		
		System.out.println("O resultado da multiplica��o �: " + resultado);
	}
}
