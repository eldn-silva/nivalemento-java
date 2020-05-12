import java.util.Locale;
import java.util.Scanner;

public class Calculo_IR {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner dados = new Scanner(System.in);
		System.out.println("~~ Dados de Entrada do Funcionário ~~");
		System.out.print("Nome do funcionário: ");
		String nome = dados.nextLine();
		System.out.printf("Salário do funcionário %s: ", nome);
		double salario = dados.nextDouble();
		
		double impostoRenda;
		if (salario > 0 && salario <= 2000) {
			impostoRenda = 0;
		} else if (salario > 2000 && salario <= 3000 ) {
			impostoRenda = (salario - 2000) * 0.08;
		} else if (salario > 3000 && salario <= 4500) {
			impostoRenda = (salario - 3000) * 0.18 + (1000*0.08);
		} else {
			impostoRenda = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
		}
		
		System.out.println();
		System.out.println("~~~~ Dados de saída do funcionário ~~~~");
		System.out.printf("Nome: %s\n", nome);
		System.out.printf("Salário R$: %.2f\n", salario);
		
		if (impostoRenda == 0) {
			System.out.print("Imposto de renda = ISENTO");
		} else {
			System.out.printf("Imposto de renda R$: %.2f", impostoRenda);
		}
		
		dados.close();	
	}

}
