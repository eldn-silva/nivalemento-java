import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		System.out.println("~~ Somat�ria de n�meros ~~");
		System.out.println();
		System.out.print("Digite o n�mero 1: ");
		int numero1 = dados.nextInt();
		
		System.out.print("Digite o n�mero 2: ");
		int numero2 = dados.nextInt();

		int soma = numero1 + numero2;
		
		System.out.printf("A soma dos n�meros �: %d ", soma);
		
		dados.close();
	
	}

}
