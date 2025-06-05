package equipe04;
import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.println("Veja sua idade em dias");

        System.out.print("Digite sua idade em anos: ");
        int anos = escaneia.nextInt();

        System.out.print("Digite quantos meses se passaram desde o último aniversário: ");
        int meses = escaneia.nextInt();

        System.out.print("Digite quantos dias se passaram desde o último mêsversário: ");
        int dias = escaneia.nextInt();

        int idadeDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você tem aproximadamente " + idadeDias + " dias de vida!");

        escaneia.close();
    }
}
