package equipe04;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        final float precoGasolina = 3.30f;
        final float precoAlcool = 2.90f;

        System.out.print("Digite a quantidade de litros vendidos: ");
        float litros = escaneia.nextFloat();
        escaneia.nextLine();

        System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
        String tipo = escaneia.nextLine().toUpperCase();

        float precoLitro;
        float descontoPorLitro;

        if (tipo.equals("A")) {
            precoLitro = precoAlcool;
            descontoPorLitro = (litros <= 20) ? 0.03f : 0.05f;
        } else if (tipo.equals("G")) {
            precoLitro = precoGasolina;
            descontoPorLitro = (litros <= 20) ? 0.04f : 0.06f;
        } else {
            System.out.println("Tipo de combustível inválido.");
            escaneia.close();
            return;
        }

        float precoSemDesconto = litros * precoLitro;
        float valorDesconto = litros * precoLitro * descontoPorLitro;
        float valorFinal = precoSemDesconto - valorDesconto;

        System.out.printf("Valor total a pagar: R$ %.2f%n", valorFinal);

        escaneia.close();
    }
}