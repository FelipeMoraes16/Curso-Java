/**
 * Objetivo: Determinar o nível de satisfação baseado em número fornecido,
 * e imprimir na tela o feedback, utilizando o switch expression.
 */

public class NivelDeSatisfacao {

	public static void main(String[] args) {


		int nivel = 6;

		String feedback;

		switch (nivel) {

			case 1 -> feedback = "Muito insatisfeito.";

			case 2 -> feedback = "Insatisfeito.";

			case 3 -> feedback = "Neutro.";

			case 4 -> feedback = "Satisfeito.";

			case 5 -> feedback = "Muito satisfeito.";

			default -> feedback = "Opção inválida.";
		}

		System.out.println(feedback);

	}
}