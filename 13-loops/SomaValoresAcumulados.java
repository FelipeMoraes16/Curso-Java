/**
 * Objetivo: Somar os números de um loop de 1 a 10,
 * usando o for.
 */

public class SomaValoresAcumulados {

	public static void main(String[] args) {

		int soma = 0;

		for (int i = 1; i <= 10; i++) {

			soma += i;
		}

		System.out.println(soma);
	}
}