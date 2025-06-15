package equipe04;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String time1 = escaneia.nextLine();

        System.out.print("Digite o nome do segundo time: ");
        String time2 = escaneia.nextLine();

        System.out.print("Digite o número de gols marcados pelo " + time1 + ": ");
        int gols1 = escaneia.nextInt();

        System.out.print("Digite o número de gols marcados pelo " + time2 + ": ");
        int gols2 = escaneia.nextInt();

        if (gols1 > gols2) {
            System.out.println("Vencedor: " + time1);
        } else if (gols2 > gols1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }

        escaneia.close();
    }
}