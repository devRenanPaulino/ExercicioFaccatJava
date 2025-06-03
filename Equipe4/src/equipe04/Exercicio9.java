package equipe04;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Reajuste Salarial");
		System.out.println("Digite o sálario do funcionário: ");
		float salario = escaneia.nextFloat();
		System.out.println("Digite o percentual de Reajuste: ");
		float reajuste = escaneia.nextFloat();
		
		float valorReajuste = (float) reajuste / 100 * salario;
		float novoSalario = (float) valorReajuste + salario;
		
		System.out.printf("%no valor do reajuste é R$: %s e o salário total ficou em R$ %s %n", valorReajuste, novoSalario);
		
		escaneia.close();
	}
}
