import java.util.Locale;
import java.util.Scanner;

public class Calculo_area_circulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner raio = new Scanner(System.in);
		
		System.out.println("~~ CALCULADORA DE �REA DE C�RCULOS ~~");
		System.out.println();
		System.out.print("Ser� digitado o raio (R) ou o di�metro do c�rculo (D) ? ");
		char opcao = raio.next().charAt(0);
		
		double area = 0;
		if (opcao == 'R') {
			System.out.print("Digite ent�o o valor do RAIO (cm): ");
			double valor = raio.nextDouble();
			area = Math.PI * Math.pow(valor, 2);
		}
		
		if (opcao == 'D') {
			System.out.print("Digite ent�o o valor do DI�METRO (cm): ");
			double valor = raio.nextDouble();
			area = Math.PI * Math.pow(valor, 2)/4;
		}
		
		System.out.printf("O valor da �rea do c�rculo � igual a: %.2f cm�", area);
		
		raio.close();
	
	}

}
