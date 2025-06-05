package equipe04;
import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Área do Triângulo");
		System.out.println("Digite a base: ");
		float base = escaneia.nextFloat();
		System.out.println("Digite a altura: ");
		float altura = escaneia.nextFloat();
		
		float area = (base * altura) / 2;
		
		System.out.println("A área do triângulo é: " + area + "cm²");
	}
}
