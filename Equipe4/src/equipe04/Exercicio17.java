package equipe04;
import java.util.Scanner;

public class Exercicio17 {
	  public static void main(String[] args) {
	        Scanner escaneia = new Scanner(System.in);

	        System.out.println("Verificação de Aprovação");
	        
	        System.out.print("Digite a nota da 1ª avaliação: ");
	        float nota1 = escaneia.nextFloat();

	        System.out.print("Digite a nota da 2ª avaliação: ");
	        float nota2 = escaneia.nextFloat();

	        float media = (nota1 + nota2) / 2;

	        System.out.printf("Média do aluno: %.2f%n", media);

	        if (media >= 6.0) {
	            System.out.println("Aluno aprovado!");
	        } else {
	            System.out.println("Aluno reprovado.");
	        }

	        escaneia.close();
	    }
}
