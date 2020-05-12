import java.util.Locale;
import java.util.Scanner;

public class Intervalo_numeros {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("~~ Identificador de intervalos numéricos entre 0 e 100 ~~");
		System.out.println();
		System.out.print("Digite um número de 0 a 100: ");
		double num = numero.nextDouble();
		
		if (num >= 0 && num <= 25) {
			System.out.print("Intervalo do número [0,25]");
		} else if (num > 25 && num <= 50){
			System.out.print("Intervalo do número (25,50]");
		} else if (num > 50 && num <= 75) {
			System.out.print("Intervalo do número (50,75]");
		} else if (num > 75 && num <= 100) {
			System.out.print("Intervalor do número (75,100]");
		} else {
			System.out.println("Número fora do intervalo !");
		}
		
		numero.close();
	}

}
