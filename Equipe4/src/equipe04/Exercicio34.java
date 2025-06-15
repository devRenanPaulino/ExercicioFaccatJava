package equipe04;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = escaneia.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = escaneia.nextInt();

        int z = (x * y) + 5;
        char resposta;

        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }

        System.out.println("Z = " + z + ", Resposta = " + resposta);

        escaneia.close();
    }
}
