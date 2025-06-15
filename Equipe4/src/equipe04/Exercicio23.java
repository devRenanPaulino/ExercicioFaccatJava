package equipe04;
import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		System.out.println("Peso Ideal");
		System.out.println("Digite seu sexo (M/F): ");
		String sexo = escaneia.next();
		System.out.println("Digite sua altura: ");
		float altura = escaneia.nextFloat();
		
		 float pesoIdeal;
	        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino")) {
	            pesoIdeal = (float) ((72.7 * altura) - 58);
	            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
	        } else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("Feminino")) {
	            pesoIdeal = (float) ((62.1 * altura) - 44.7);
	            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
	        } else {
	            System.out.println("Sexo inválido.");
	        }

	        escaneia.close();
	}
}
