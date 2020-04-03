import java.util.Locale;
import java.util.Scanner;

public class Calculo_area_circulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner raio = new Scanner(System.in);
		
		System.out.println("~~ CALCULADORA DE ÁREA DE CÍRCULOS ~~");
		System.out.println();
		System.out.print("Será digitado o raio (R) ou o diâmetro do círculo (D) ? ");
		char opcao = raio.next().charAt(0);
		
		double area = 0;
		if (opcao == 'R') {
			System.out.print("Digite então o valor do RAIO (cm): ");
			double valor = raio.nextDouble();
			area = Math.PI * Math.pow(valor, 2);
		}
		
		if (opcao == 'D') {
			System.out.print("Digite então o valor do DIÂMETRO (cm): ");
			double valor = raio.nextDouble();
			area = Math.PI * Math.pow(valor, 2)/4;
		}
		
		System.out.printf("O valor da área do círculo é igual a: %.2f cm²", area);
		
		raio.close();
	
	}

}
