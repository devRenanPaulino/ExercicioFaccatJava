package equipe04;
import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = escaneia.nextInt();
		
		String mensagemPersonalizada =  numero > 10 ? "É maior que 10":
			numero == 10 ? "É igual a dez": "É menor que 10";
		
		System.out.println(mensagemPersonalizada);
		
		escaneia.close();
	}
}
