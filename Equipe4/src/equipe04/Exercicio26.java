package equipe04;
import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Digite a Quantidade do produto no estoque:");
		int produtoEstoque = escaneia.nextInt();
		System.out.println("Digite a quantidade m�xima do estoque:");
		int estoqueMaximo = escaneia.nextInt();
		System.out.println("Digite a Quantidade m�nima do estoque:");
		int estoqueMinimo = escaneia.nextInt();
		
		float mediaEstoque = (estoqueMaximo + estoqueMinimo) / 2;
		
		String mensagem = produtoEstoque >= mediaEstoque ? "N�o efetuar a compra!" : "Efetuar Compra!";
		
		System.out.print(mensagem);
		
		escaneia.close();
	}
}
