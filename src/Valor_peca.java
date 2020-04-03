import java.util.Locale;
import java.util.Scanner;

public class Valor_peca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código da peça 1: ");
		int peca1 = sc.nextInt();
		System.out.print("Quantidade da peça 1: ");
		int quantidade1 = sc.nextInt();
		System.out.print("Valor da peca 1 R$: ");
		double valor1 = sc.nextDouble();
		System.out.println();
		System.out.print("Código da peça 2: ");
		int peca2 = sc.nextInt();
		System.out.print("Quantidade da peça 2: ");
		int quantidade2 = sc.nextInt();
		System.out.print("Valor da peca 2 R$: ");
		double valor2 = sc.nextDouble();
		
		double total = quantidade1*valor1 + quantidade2*valor2;
		
		System.out.println();
		
		System.out.printf("Código das peças adquiridas: %d e %d. Valor total da compra R$: %.2f\n", peca1, peca2, total);
		
		sc.close();
		
	}

}
