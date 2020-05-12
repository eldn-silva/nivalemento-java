import java.util.Locale;
import java.util.Scanner;

public class Pedido_lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);
		
		System.out.println("~~ LANCHONETE ~~");
		System.out.println();
		System.out.printf("TABELA DE C�DIGOS E PRE�OS\n"
						+ "C�digo " + "Especifica��o " + "Pre�o\n"
						+ "[1]    " + "Hot Dog       " + "4.00\n"
						+ "[2]    " + "X-Salada      " + "4.50\n"
						+ "[3]    " + "X-Bacon       " + "5.00\n"
						+ "[4]    " + "Torrada       " + "2.00\n"
						+ "[5]    " + "Refrigerante  " + "1.50\n");
		
		System.out.println();
		System.out.print("C�digo do �tem: ");
		int codigo = dados.nextInt();
		System.out.println("Quantidade do �tem: ");
		int quantidade = dados.nextInt();
		
		String nome = null;
		double preco = 0;
		
		switch(codigo) {
		case 1: 
			preco = 4.00;
			nome = "Hot-dog";
			break;
		case 2:
			preco = 4.50;
			nome = "X-Salada";
			break;
		case 3:
			preco = 5.00;
			nome = "X-Bacon";
			break;
		case 4:
			preco = 2.00;
			nome = "Torrada";
			break;
		case 5:
			preco = 1.50;
			nome = "Refrigerante";
			break;
		}
	
	double total = quantidade * preco;
		
	System.out.printf("~~ Nota fiscal ~~\n"
			+ "Nome: %s \n"
			+ "Quantidade: %d \n"
			+ "Pre�o unit�rio: R$%.2f \n"
			+ "Pre�o total: R$%.2f \n", nome, quantidade, preco, total);	
		
		dados.close();
	}
}
