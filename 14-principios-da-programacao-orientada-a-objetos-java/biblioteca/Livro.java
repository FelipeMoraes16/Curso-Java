package biblioteca;

class Livro {

	public String titulo;
	private String autor;
	protected int anoPublicacao;
	double preco;

	public Livro () {
		titulo = "Desconhecido";
		autor = "Desconhecido";
		anoPublicacao = 0;
		preco = 0.0;
	}

	public Livro (String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		anoPublicacao = 0;
		preco = 0.0;
	}

	public Livro(String titulo, String autor,
		int anoPublicacao, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;
	}

	public String getAutor(){
		return autor;
	}
}