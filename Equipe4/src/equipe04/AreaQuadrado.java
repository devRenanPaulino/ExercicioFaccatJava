package equipe04;
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);
        
        System.out.println("Área do Quadrado");
        System.out.println("Digite o valor do lado do quadrado: ");
        float lado = escaneia.nextFloat();
        
        float area = lado * lado;
        
        System.out.println("A área do quadrado é: " + area);
    }
}