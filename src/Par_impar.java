import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("~~ INDICADOR DE NÚMERO PAR OU ÍMPAR ~~");
		System.out.println();
		System.out.print("Digite o número de entrada: ");
		int n = entrada.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Número digitado é PAR.");
		} else {
			System.out.println("Número digitado é ÍMPAR.");
		}
		
		entrada.close();
	}
}
