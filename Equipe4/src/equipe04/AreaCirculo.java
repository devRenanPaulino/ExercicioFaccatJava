package equipe04;
import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("�rea do C�rculo");
		System.out.println("Digite o raio do circulo: ");
		float raio = escaneia.nextFloat();
		
		double area = raio * raio * Math.PI;
		
		System.out.println("A �rea do c�rculo �: " + area + "cm2");
		
		escaneia.close();
	}
}
