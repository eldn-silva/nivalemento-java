import java.util.Scanner;

public class Diferenca_produto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("~~Diferen�a de produtos~~");
		System.out.println();
		System.out.print("Digite o 1� valor: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o 2� valor: ");
		int n2 = sc.nextInt();
		System.out.print("Digite o 3� valor: ");
		int n3 = sc.nextInt();
		System.out.print("Digite o 4� valor: ");
		int n4 = sc.nextInt();
		
		System.out.printf("O produto entre os 2 primeiros n�meros digitados (p1) � igual a: %d\n", n1*n2);
		System.out.printf("O produto entre os 2 �ltimos n�meros digitados (p2) � igual a: %d\n", n3*n4);
		System.out.printf("A diferen�a entre os produtos p1 e p2 � igual a: %d\n", (n1*n2) - (n3*n4));
		
		sc.close();
	}

}
