package equipe04;
import java.util.Scanner;

public class Exercicio38 {
	 public static void main(String[] args) {
		 Scanner escaneia = new Scanner(System.in);

	     int codigoCorreto = 1234;
	     int senhaCorreta = 9999;

	     System.out.print("Digite o c�digo do usu�rio: ");
	     int codigoUsuario = escaneia.nextInt();

	     if (codigoUsuario != codigoCorreto) {
	    	 System.out.println("Usu�rio inv�lido!");
	     } else {
	    	 System.out.print("Digite a senha: ");
	         int senha = escaneia.nextInt();

	         if (senha != senhaCorreta) {
	        	 System.out.println("Senha incorreta!");
	         } else {
	           System.out.println("Acesso permitido.");
	           }
	        }

	        escaneia.close();
	 }
}
