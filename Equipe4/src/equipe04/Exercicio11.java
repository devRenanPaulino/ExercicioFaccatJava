package equipe04;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Salário após comissões");
		System.out.println("Digite o sálario fixo do empregado: ");
		float salarioFixo = escaneia.nextFloat();
		System.out.println("Digite o número total de carros vendidos pelo funcionário: ");
		int totalVendido = escaneia.nextInt();
		System.out.println("Digite o valor total das vendas bruta: ");
		float totalVendas = escaneia.nextFloat();
		System.out.println("Digite o valor fixo da comissão por carro vendido: ");
		float comissaoFixa = escaneia.nextFloat();
		
		float salarioFinal = (float) salarioFixo + (totalVendido * comissaoFixa) + (5/100 * totalVendas);
		
		System.out.println("O sálario final do empregado é R$: " + salarioFinal);
		
		escaneia.close();
		
	}
}
