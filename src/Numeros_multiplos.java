import java.util.Scanner;

public class Numeros_multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("~~ VERIFICADOR DE N�MEROS M�LTIPLOS ~~");
		System.out.println();
		System.out.print("Digite o primeiro n�mero: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int n2 = sc.nextInt();		
		System.out.println();
		double divisao;
		if (n1 > n2) {
			divisao = n1 % n2;
		} else {
			divisao = n2 % n1;
		}
		
		if (divisao == 0) {
			System.out.println("N�meros M�LTIPLOS");
		} else {
			System.out.println("N�meros N�O M�LTIPLOS");
		}
		
		sc.close();
	}

}
