package equipe04;
import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Descubra se voc� poder� votar esse ano!");
		System.out.print("Digite seu ano de nascimento: ");
		int anoNascimento = escaneia.nextInt();
		System.out.print("Digite o ano atual: ");
		int anoAtual = escaneia.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		String mensagem = idade < 16 ? "N�o poder� votar!" : idade <18 || idade > 70 ? "voto opicional!" : "poder� votar!";
		
		System.out.print(mensagem);
	}
}
