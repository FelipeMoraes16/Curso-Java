package teste_final;

/**
 * Objetivo: Entender o uso da palavra-chave final 
 * para variáveis em Java.
 */

public class FinalVariables {

	public static void imprimirValoresFinais(int numeroMaximo, String mensagem) {
		System.out.println(numeroMaximo);
		System.out.println(mensagem);
	}

	public static void main(String[] args) {

		final int NUMERO_MAXIMO = 100;
		final String MENSAGEM = "Bem-vindo ao mundo da programação!";

		// NUMERO_MAXIMO = 101;
		// MENSAGEM = "Teste";

		imprimirValoresFinais(NUMERO_MAXIMO, MENSAGEM);
	}
}