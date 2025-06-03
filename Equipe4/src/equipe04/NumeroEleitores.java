package equipe04;
import java.util.Scanner;

public class NumeroEleitores {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Número de Eleitores");
		System.out.println("Digite o número total de eleitores: ");
		int totalEleitores = escaneia.nextInt();
		System.out.println("Digite o número de votos brancos: ");
		int votosBrancos = escaneia.nextInt();
		System.out.println("Digite o número de votos nulos: ");
		int votosNulos = escaneia.nextInt();
		System.out.println("Por fim, digite o número de votos válidos: ");
		int votosValidos = escaneia.nextInt();
		
		double perBrancos = (double) votosBrancos / totalEleitores * 100;
		double perNulos = (double) votosNulos / totalEleitores * 100;
		double perValidos = (double) votosValidos / totalEleitores * 100;
		
		System.out.println("O percentual de eleitores com votos brancos é: " + perBrancos + "%");
		System.out.println("O percentual de eleitores com votos nulos é: " + perNulos + "%");
		System.out.println("O percentual de eleitores com votos válidos é: " + perValidos + "%");
		
		escaneia.close();
		
	}
}
