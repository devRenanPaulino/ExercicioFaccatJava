package equipe04;
import java.util.Scanner;

public class Exercicio41 {
	 public static void main(String[] args) {
		 Scanner escaneia = new Scanner(System.in);

	     System.out.print("Digite a nota da primeira verificação (N1): ");
	     float nota1 = escaneia.nextFloat();
	     System.out.print("Digite a nota da segunda verificação (N2): ");
	     float nota2 = escaneia.nextFloat();
	     System.out.print("Digite a nota da terceira verificação (N3): ");
	     float nota3 = escaneia.nextFloat();
	     System.out.print("Digite a média dos exercícios: ");
	     float mediaExercicios = escaneia.nextFloat();

	     float mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;

	     String conceito = (mediaAproveitamento >= 9.0f) ? "A" :
	                       (mediaAproveitamento >= 7.5f) ? "B" :
	                       (mediaAproveitamento >= 6.0f) ? "C" : 
	                    	   "D";

	        System.out.printf("Média de Aproveitamento: %.2f\n", mediaAproveitamento);
	        System.out.println("Conceito: " + conceito);

	        escaneia.close();
	 }
}
