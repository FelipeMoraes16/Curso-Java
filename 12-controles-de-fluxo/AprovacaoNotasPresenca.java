/**
 * Objetivo: Aprovar ou Reprovar um aluno(a), se a média das
 * notas for maior ou igual a 7 e a frequência for maior ou 
 * igual a 75, será aprovado(a), caso contrário será reprovado(a),
 * para esse exercicío foi utilizado o operador lógico &&.
 */

public class AprovacaoNotasPresenca {

	public static void main(String[] args) {

		double nota1 = 7.0;
		double nota2 = 7.0;
		double frequencia = 75.0;

		double media = (nota1 + nota2) / 2;

		System.out.println("Nota: " + media);
		System.out.println("Frequencia: " + frequencia + "%");

		if (media >= 7 && frequencia >= 75) {
			System.out.println("Aluno(a) Aprovado(a)!");
		} else {
			System.out.println("Aluno(a) Reprovado(a)!");
		}
	}
}