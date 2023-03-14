package jogoSimouNao;

public class Validar {

	public void validaçao() {

		if (Pergunta.respostaEcolhida.equals(Pergunta.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("ERROU ");
		}

	}
}