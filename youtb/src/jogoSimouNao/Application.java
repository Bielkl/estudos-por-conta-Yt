package jogoSimouNao;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Application {

	public static void man(String[] args) {

		System.out.println("===== SIM OU NAO  ====");
		System.out.println("=======================");
		System.out.println("qual opçao voce deseja?");
		System.out.println("1 iniciar");
		System.out.println("2 perguntas");
		System.out.println("0 sair do game");
	}

	public static void iniciar() {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		do {
			switch (opcao) {
			case 1:
			    Iniciar.inicio();
				break;
			case 2:
				Perguntas.mostraPergunta(null);

			default:
				System.out.println("Digite um numero valido ");
				break;
			}
		} while (opcao != 0);
		sc.close();
	}
}