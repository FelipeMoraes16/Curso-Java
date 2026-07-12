package rpg;

class Personagem {

	public String nome;
	public int nivelDePoder;

	public Personagem(String nome, int nivelDePoder) {
		this.nome = nome;
		this.nivelDePoder = nivelDePoder;
	}

	public void aumentarNivel(int nivel){
		nivel += 10;
	}

	public void mudarNome(Personagem personagem, String nomeNovo){
		nome = nomeNovo;
	}
}