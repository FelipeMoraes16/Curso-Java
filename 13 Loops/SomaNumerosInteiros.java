/**
 * Objetivo: Somar todos os numeros positivos menor ou igual,
 * ao limite fornecido, e mostrar na tela o resultado, usando
 * o do-while.
 */

public class SomaNumerosInteiros {

	public static void main(String[] args) {

		int limite = 10;
		int soma = 0;

		do {
			soma += limite;
			limite--;

		} while (limite > 0);

		System.out.println(soma);
	}
}