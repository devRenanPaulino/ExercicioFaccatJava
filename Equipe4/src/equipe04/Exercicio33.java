package equipe04;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        int b = scanner.nextInt();

        String resultado = (a == b) ? "N�meros iguais" : (a > b) ? "Primeiro � maior" : "Segundo � maior";

        System.out.println(resultado);

        scanner.close();
    }
}