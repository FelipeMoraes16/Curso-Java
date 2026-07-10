package produto;

public class Produto {

	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto (String nome, double preco, int quantidadeEmEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public void obterInfo() {
		System.out.println("Nome: " + nome 
			+ " | Preço: " + preco
			+ " | Quantidade em estoque: " + quantidadeEmEstoque);
	}
}