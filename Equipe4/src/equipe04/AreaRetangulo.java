package equipe04;
import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Área do Retângulo");
		System.out.println("Digite a base do retãngulo: ");
		float base = escaneia.nextFloat();
		System.out.println("Digite a altura do retãngulo: ");
		float altura = escaneia.nextFloat();
		
		float area = base * altura;
		
		System.out.println("A área do retâgunlo é " + area + "cm²");
		
		escaneia.close();
	}
}
