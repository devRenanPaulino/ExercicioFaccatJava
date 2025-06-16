package equipe04;
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.println("Descrição do Produto: ");
        String nomeProduto = escaneia.nextLine();

        System.out.println("Quantidade adquirida: ");
        int quantidade = escaneia.nextInt();

        System.out.println("Preço unitário: ");
        float precoUnitario = escaneia.nextFloat();

        float total = quantidade * precoUnitario;

        float percentualDesconto = quantidade <= 5 ? 0.02f :
                                   (quantidade <= 10 ? 0.03f : 0.05f);

        float desconto = total * percentualDesconto;
        float totalPagar = total - desconto;

        System.out.printf("\nProduto: %s\n", nomeProduto);
        System.out.printf("Quantidade: %d unidades\n", quantidade);
        System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Total bruto: R$ %.2f\n", total);
        System.out.printf("Desconto aplicado: %.0f%% (R$ %.2f)\n", percentualDesconto * 100, desconto);
        System.out.printf("Total a pagar: R$ %.2f\n", totalPagar);

        escaneia.close();
    }
}
