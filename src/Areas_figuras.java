import java.util.Locale;
import java.util.Scanner;

public class Areas_figuras {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner valores = new Scanner(System.in);
		
		System.out.println("Vamos calcular áreas de figuras geométricas ? ");
		System.out.println("Me informe 3 valores: A, B e C...");
		System.out.println();
		System.out.print("Digite o valor A: ");
		double a = valores.nextDouble();
		System.out.print("Digite o valor B: ");
		double b = valores.nextDouble();
		System.out.print("Digite o valor C: ");
		double c = valores.nextDouble();
		
		double trianguloRetangulo = (a * c)/2;
		double circulo = Math.PI * Math.pow(c, 2);
		double trapezio = ((a + b)/2) * c;
		double quadrado = b * b;
		double retangulo = a * b;
		
		System.out.println();
		
		System.out.println("Com esses valores calculei áreas de VÁRIAS figuras geométricas. Segue abaixo: ");
		System.out.println();
		System.out.printf("Área do triângulo. Base = A; Altura = C -> %.2f\n", trianguloRetangulo);
		System.out.printf("Área do círculo. Raio = C -> %.2f\n", circulo);
		System.out.printf("Área do trapezio. Bases = A e B; Altura = C -> %.2f\n", trapezio);
		System.out.printf("Área do quadrado. Lado = B -> %.2f\n", quadrado);
		System.out.printf("Área do retângulo. Base = A; Altura = B -> %.2f", retangulo);
		
		valores.close();
	}

}
