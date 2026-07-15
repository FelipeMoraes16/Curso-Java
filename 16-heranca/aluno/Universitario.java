package aluno;

/**
 * Objetivo: Demonstrar como a palavra-chave super é 
 * usada para acessar membros da classe pai (superclasse) 
 * em uma subclasse.
 */

class Pessoa {

	String nome;
	int idade;

	Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}

class Estudante extends Pessoa {

	int matricula;

	Estudante (String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}
}

public class Universitario {

	public static void main(String[] args) {

		Estudante estudante = new Estudante("Felipe", 35, 123456789);

		System.out.println("--- Informações do Universitário ---");
		System.out.println("Nome: " + estudante.nome);
		System.out.println("Idade: " + estudante.idade);
		System.out.println("Número da matrícula: " 
			+ estudante.matricula);

	}
}