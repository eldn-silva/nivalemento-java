import java.util.Locale;
import java.util.Scanner;

public class Areas_figuras {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner valores = new Scanner(System.in);
		
		System.out.println("Vamos calcular �reas de figuras geom�tricas ? ");
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
		
		System.out.println("Com esses valores calculei �reas de V�RIAS figuras geom�tricas. Segue abaixo: ");
		System.out.println();
		System.out.printf("�rea do tri�ngulo. Base = A; Altura = C -> %.2f\n", trianguloRetangulo);
		System.out.printf("�rea do c�rculo. Raio = C -> %.2f\n", circulo);
		System.out.printf("�rea do trapezio. Bases = A e B; Altura = C -> %.2f\n", trapezio);
		System.out.printf("�rea do quadrado. Lado = B -> %.2f\n", quadrado);
		System.out.printf("�rea do ret�ngulo. Base = A; Altura = B -> %.2f", retangulo);
		
		valores.close();
	}

}
