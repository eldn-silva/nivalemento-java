import java.util.Scanner;

public class Numeros_multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("~~ VERIFICADOR DE NÚMEROS MÚLTIPLOS ~~");
		System.out.println();
		System.out.print("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int n2 = sc.nextInt();		
		System.out.println();
		double divisao;
		if (n1 > n2) {
			divisao = n1 % n2;
		} else {
			divisao = n2 % n1;
		}
		
		if (divisao == 0) {
			System.out.println("Números MÚLTIPLOS");
		} else {
			System.out.println("Números NÃO MÚLTIPLOS");
		}
		
		sc.close();
	}

}
