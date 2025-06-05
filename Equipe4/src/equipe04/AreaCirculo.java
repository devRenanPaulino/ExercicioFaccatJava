package equipe04;
import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Área do Círculo");
		System.out.println("Digite o raio do circulo: ");
		float raio = escaneia.nextFloat();
		
		double area = raio * raio * Math.PI;
		
		System.out.println("A área do círculo é: " + area + "cm2");
		
		escaneia.close();
	}
}
