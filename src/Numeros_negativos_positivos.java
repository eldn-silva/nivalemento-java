import java.util.Scanner;

public class Numeros_negativos_positivos {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		
		System.out.println("~~ IDENTIFICADOR DE NÚMEROS NEGATIVOS E POSITIVOS ~~");
		System.out.println();
		System.out.print("Digite um número inteiro: ");
		int n = numeros.nextInt();
		
		if (n > 0) {
			System.out.print("Número digitado é POSITIVO");
		} else {
			System.out.print("Número digitado é NEGATIVO");
		}
		
		numeros.close();
	}
}
