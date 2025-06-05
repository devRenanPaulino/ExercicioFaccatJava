package equipe04;
import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Descubra se você poderá votar esse ano!");
		System.out.print("Digite seu ano de nascimento: ");
		int anoNascimento = escaneia.nextInt();
		System.out.print("Digite o ano atual: ");
		int anoAtual = escaneia.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		String mensagem = idade < 16 ? "Não poderá votar!" : idade <18 || idade > 70 ? "voto opicional!" : "poderá votar!";
		
		System.out.print(mensagem);
	}
}
