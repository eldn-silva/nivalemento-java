import java.util.Locale;
import java.util.Scanner;

public class Salario_funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados_funcionario = new Scanner(System.in);
		
		System.out.println("~~ENTRADA DE DADOS FUNCIONÁRIO ~~");
		System.out.print("ID do funcionário: ");
		int id = dados_funcionario.nextInt();
		System.out.print("Número de horas trabalhadas no mês atual: ");
		double horas = dados_funcionario.nextDouble();
		System.out.print("Valor da hora trabalhada: ");
		double valorHora = dados_funcionario.nextDouble();
		
		System.out.println();
		System.out.println("SAÍDA DE DADOS FUNCIONÁRIO");
		System.out.printf("ID do funcionário: %d\n", id);
		System.out.printf("Salário do funcionário: R$%.2f\n", horas*valorHora);
		
		
		dados_funcionario.close();
	}

}
