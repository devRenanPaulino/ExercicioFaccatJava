package equipe04;
import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		
		  System.out.println("Morango: Até 5Kg = R$ 2,50 | Acima de 5Kg = R$ 2,20");
	      System.out.println("Maçã:    Até 5Kg = R$ 1,80 | Acima de 5Kg = R$ 1,50");

	      System.out.print("Digite a quantidade de morangos (em Kg): ");
	      float kgMorango = escaneia.nextFloat();

	      System.out.print("Digite a quantidade de maçãs (em Kg): ");
	      float kgMaca = escaneia.nextFloat();

	      float precoMorango = kgMorango <= 5 ? 2.50f : 2.20f;
	      float precoMaca = kgMaca <= 5 ? 1.80f : 1.50f;

	      float totalMorango = kgMorango * precoMorango;
	      float totalMaca = kgMaca * precoMaca;
	      float totalCompra = totalMorango + totalMaca;
	      float pesoTotal = kgMorango + kgMaca;
	      
	        if (pesoTotal > 8 || totalCompra > 25.00f) {
	            totalCompra -= totalCompra * 0.10f;
	        }

	        System.out.printf("🧾 Valor total a pagar: R$ %.2f%n", totalCompra);
		
		escaneia.close();
	}
}
