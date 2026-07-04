/**
 * Objetivo: Avaliar se um aluno será aprovado(a) ou reprovado(a),
 * baseado na sua media, utilizando condicional if.
 */

public class AprovacaoSimplificada {

	public static void main(String[] args) {

		double nota1 = 5.0;
		double nota2 = 6.0;

		double media = (nota1 + nota2) / 2;

		System.out.println("Nota: " + media);

		if (media >= 6) {
			System.out.println("Aluno(a) Aprovado(a)!");
		} else {
			System.out.println("Aluno(a) Reprovado(a)!");
		}
	}
}