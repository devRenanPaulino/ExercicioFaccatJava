package equipe04;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de Triângulo");
        System.out.print("Digite o valor do lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double c = scanner.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("Forma um triângulo");
        } else {
            System.out.println("Não forma");
        }
        
        scanner.close();
    }
}