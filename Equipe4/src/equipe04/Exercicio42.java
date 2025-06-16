package equipe04;
import java.util.Scanner;


public class Exercicio42 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Digite o código do empregado: ");
		int codigo = escaneia.nextInt();
		
		System.out.println("Digite o ano de nascimento do empregado: ");
		int anoNascimento = escaneia.nextInt();
		
		System.out.println("Digite o ano de ingresso do funcionário: ");
		int anoIngresso = escaneia.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = escaneia.nextInt();
		
		 int idade = anoAtual - anoNascimento;
	     int tempoTrabalho = anoAtual - anoIngresso;
	     
	     boolean podeAposentar = (idade >= 65) || (tempoTrabalho >= 30) || (idade >= 60 && tempoTrabalho >= 25);
	     
	     System.out.println("\n--- Resultado ---");
	     System.out.println("Código do empregado: " + codigo);
	     System.out.println("Idade: " + idade + " anos");
	     System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

	     if (podeAposentar) {
	    	 System.out.println("Situação: Requerer aposentadoria.");
	     } else {
	         System.out.println("Situação: Não requerer.");
	     }

	     escaneia.close();
	}
}
