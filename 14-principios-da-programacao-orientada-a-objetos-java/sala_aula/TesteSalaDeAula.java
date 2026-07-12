package sala_aula;

/**
 * Objetivo: Praticar o uso de variáveis e métodos static,
 * criando uma classe com variável e métodos static, e em
 * outra classe criar as instâncias e ver os resultados.
 */

public class TesteSalaDeAula {

	public static void main(String[] args) {

		SalaDeAula aluno1 = new SalaDeAula();
		SalaDeAula aluno2 = new SalaDeAula();
		SalaDeAula aluno3 = new SalaDeAula();

		aluno1.adicionarAluno();
		aluno2.adicionarAluno();
		aluno3.adicionarAluno();

		SalaDeAula.obterQuantidadeAlunos();
	}
}