import java.util.Scanner;

public class Numeros_negativos_positivos {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		
		System.out.println("~~ IDENTIFICADOR DE N�MEROS NEGATIVOS E POSITIVOS ~~");
		System.out.println();
		System.out.print("Digite um n�mero inteiro: ");
		int n = numeros.nextInt();
		
		if (n > 0) {
			System.out.print("N�mero digitado � POSITIVO");
		} else {
			System.out.print("N�mero digitado � NEGATIVO");
		}
		
		numeros.close();
	}
}
