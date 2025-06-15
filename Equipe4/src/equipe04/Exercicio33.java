package equipe04;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        String resultado = (a == b) ? "Números iguais" : (a > b) ? "Primeiro é maior" : "Segundo é maior";

        System.out.println(resultado);

        scanner.close();
    }
}