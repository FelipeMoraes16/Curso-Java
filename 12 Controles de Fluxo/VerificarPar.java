/**
 * Objetivo: Verificar se um número é par ou ímpar.
 */

public class VerificarPar {

	public static void main(String[] args) {

		int numero = 1;

		String mensagem = (numero % 2 == 0) ? 
		"O número é par." : 
		"O número é ímpar.";

		System.out.println(mensagem);
	}
}