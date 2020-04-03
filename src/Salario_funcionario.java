import java.util.Locale;
import java.util.Scanner;

public class Salario_funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados_funcionario = new Scanner(System.in);
		
		System.out.println("~~ENTRADA DE DADOS FUNCION�RIO ~~");
		System.out.print("ID do funcion�rio: ");
		int id = dados_funcionario.nextInt();
		System.out.print("N�mero de horas trabalhadas no m�s atual: ");
		double horas = dados_funcionario.nextDouble();
		System.out.print("Valor da hora trabalhada: ");
		double valorHora = dados_funcionario.nextDouble();
		
		System.out.println();
		System.out.println("SA�DA DE DADOS FUNCION�RIO");
		System.out.printf("ID do funcion�rio: %d\n", id);
		System.out.printf("Sal�rio do funcion�rio: R$%.2f\n", horas*valorHora);
		
		
		dados_funcionario.close();
	}

}
