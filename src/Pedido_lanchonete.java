import java.util.Locale;
import java.util.Scanner;

public class Pedido_lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);
		
		System.out.println("~~ LANCHONETE ~~");
		System.out.println();
		System.out.printf("TABELA DE CÓDIGOS E PREÇOS\n"
						+ "Código " + "Especificação " + "Preço\n"
						+ "[1]    " + "Hot Dog       " + "4.00\n"
						+ "[2]    " + "X-Salada      " + "4.50\n"
						+ "[3]    " + "X-Bacon       " + "5.00\n"
						+ "[4]    " + "Torrada       " + "2.00\n"
						+ "[5]    " + "Refrigerante  " + "1.50\n");
		
		System.out.println();
		System.out.print("Código do ítem: ");
		int codigo = dados.nextInt();
		System.out.println("Quantidade do ítem: ");
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
			+ "Preço unitário: R$%.2f \n"
			+ "Preço total: R$%.2f \n", nome, quantidade, preco, total);	
		
		dados.close();
	}
}
