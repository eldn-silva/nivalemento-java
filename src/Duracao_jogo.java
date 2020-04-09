import java.util.Scanner;

public class Duracao_jogo {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		System.out.println("~~ CALCULADORA DE DURAÇÃO DE JOGOS ~~");
		System.out.println();
		System.out.print("Digite horário do início do jogo: ");
		int hora1 = dados.nextInt();
		System.out.print("Digite horário do fim do jogo: ");
		int hora2 = dados.nextInt();
		
		System.out.println();
		
		int duracaoJogo;
		if (hora1 < hora2) {
			duracaoJogo = hora2 - hora1;
		} else {
			duracaoJogo = (hora2 + 24) - hora1;
		}
		
		System.out.printf("O jogo durou %d hora(s)", duracaoJogo);
		
		dados.close();
	}
}
