import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		System.out.println("~~ Somatória de números ~~");
		System.out.println();
		System.out.print("Digite o número 1: ");
		int numero1 = dados.nextInt();
		
		System.out.print("Digite o número 2: ");
		int numero2 = dados.nextInt();

		int soma = numero1 + numero2;
		
		System.out.printf("A soma dos números é: %d ", soma);
		
		dados.close();
	
	}

}
