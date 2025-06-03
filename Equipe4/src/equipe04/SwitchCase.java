package equipe04;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Digite um número:");
		int opcao = escaneia.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Segunda-Feira");
			break;
		case 2:
			System.out.println("Terça-Feira");
			break;
		case 3: 
			System.out.println("Quarta-Feira");
			break;
		case 4:
			System.out.println("Quinta-Feia");
			break;
		case 5:
			System.out.println("Sexta-Feira");
			break;
		case 6: 
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
		
		escaneia.close();
	}
}
