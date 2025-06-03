package equipe04;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Custo Final Carro");
		System.out.println("Digite o custo de produção do automóvel: ");
		float custoFabrica = escaneia.nextFloat();
		
		float percentualDistribuidor = 28;
		float imposto = 45;
		
		float custoFinal = (float) custoFabrica + ((percentualDistribuidor / 100 * custoFabrica) + (imposto / 100 * custoFabrica));
		
		System.out.println("O valor final do carro para a venda é de R$: " + custoFinal);
		
		escaneia.close();
	}
}
