import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("~~ INDICADOR DE N�MERO PAR OU �MPAR ~~");
		System.out.println();
		System.out.print("Digite o n�mero de entrada: ");
		int n = entrada.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("N�mero digitado � PAR.");
		} else {
			System.out.println("N�mero digitado � �MPAR.");
		}
		
		entrada.close();
	}
}
