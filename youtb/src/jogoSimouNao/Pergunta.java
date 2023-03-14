package jogoSimouNao;

public class Pergunta {

	String frase;
	String alternativaSIM;
	
	static String respostaEcolhida ;
	static String respostaCorreta;

	
	
	public boolean verificarRespostaCorreta(String alternativa) {
		return alternativa.equals(respostaCorreta);
		
		
	}
}
