package equipe04;
import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("�rea do Ret�ngulo");
		System.out.println("Digite a base do ret�ngulo: ");
		float base = escaneia.nextFloat();
		System.out.println("Digite a altura do ret�ngulo: ");
		float altura = escaneia.nextFloat();
		
		float area = base * altura;
		
		System.out.println("A �rea do ret�gunlo � " + area + "cm�");
		
		escaneia.close();
	}
}
