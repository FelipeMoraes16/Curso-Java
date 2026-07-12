package rpg;

/**
 * Objetivo: Praticar e entender passagem por valor
 * com variavel primitivo, e passagem por referência
 * com objeto como argumentos.
 */

public class Jogo {

	public static void main(String[] args) {

		Personagem personagem = new Personagem("Heroi", 10);

		System.out.println("Nível antes: " + personagem.nivelDePoder);
		personagem.aumentarNivel(personagem.nivelDePoder);
		System.out.println("Nível depois: " + personagem.nivelDePoder);

		System.out.println();

		System.out.println("Nome antes: " + personagem.nome);
		personagem.mudarNome(personagem, "Vilão");
		System.out.println("Nome depois: " + personagem.nome);
	}
}