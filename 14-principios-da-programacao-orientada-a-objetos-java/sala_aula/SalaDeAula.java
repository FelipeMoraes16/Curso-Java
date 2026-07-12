package sala_aula;

class SalaDeAula {

	static int totalAlunos = 0;

	public static void adicionarAluno() {
		totalAlunos++;
	}

	public static void obterQuantidadeAlunos() {
		System.out.println("Total de Alunos: " 
			+ totalAlunos);
	}
}