package equipe04;
import java.util.Scanner;

public class Exercicio17 {
	  public static void main(String[] args) {
	        Scanner escaneia = new Scanner(System.in);

	        System.out.println("Verifica��o de Aprova��o");
	        
	        System.out.print("Digite a nota da 1� avalia��o: ");
	        float nota1 = escaneia.nextFloat();

	        System.out.print("Digite a nota da 2� avalia��o: ");
	        float nota2 = escaneia.nextFloat();

	        float media = (nota1 + nota2) / 2;

	        System.out.printf("M�dia do aluno: %.2f%n", media);

	        if (media >= 6.0) {
	            System.out.println("Aluno aprovado!");
	        } else {
	            System.out.println("Aluno reprovado.");
	        }

	        escaneia.close();
	    }
}
