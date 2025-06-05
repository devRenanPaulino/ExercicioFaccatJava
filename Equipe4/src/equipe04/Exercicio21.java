package equipe04;
import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Tempo Total de uma partida de xadrez; ");
		
		System.out.print("Digite o horário de inicio do jogo (apenas hora): ");
		int inicio = escaneia.nextInt();
		System.out.print("Digite o horário de termino da partida (apenas hora): ");
		int fim = escaneia.nextInt();
		
		if (inicio < 0 || inicio > 24 || fim < 0 || fim > 24) {
            System.out.println("Horário inválido! Digite valores entre 0 e 23.");
        } else {
            int duracao = (inicio == fim) 
                ? 24 
                : (fim > inicio) 
                  ? fim - inicio 
                  : 24 - inicio + fim;

            System.out.println("A duração do jogo foi de " + duracao + " hora(s).");
        }

        escaneia.close();
		
	}
}
