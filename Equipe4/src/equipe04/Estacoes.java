package equipe04;
import java.util.Scanner;

public class Estacoes {
	public static void main(String[] args) {
		 Scanner escaneia = new Scanner(System.in);
	        System.out.println("Digite um número referente aos meses do ano que te direi sua estação: ");
	        int mes = escaneia.nextInt();

	        String estacao = switch (mes) {
	            case 12, 1, 2 -> "Verão";
	            case 3, 4, 5 -> "Outono";
	            case 6, 7, 8 -> "Inverno";
	            case 9, 10, 11 -> "Primavera";
	            default -> "Mês inválido";
	        };

	        System.out.println("A estação correspondente é: " + estacao);

	        escaneia.close();
	}
}
