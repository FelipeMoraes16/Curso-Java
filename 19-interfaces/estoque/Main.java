package estoque;

/**
 * Objetivo: Praticar o uso de interfaces em Java para 
 * definir comportamentos e implementar uma classe capaz 
 * de controlar o estoque de um produto, permitindo consultar 
 * informações e atualizar quantidades disponíveis.
 */

interface Produto {

	String getNome();

	int getQuantidade();

	void adicionarQuantidade(int quantidade);

	void removerQuantidade(int quantidade);
}

class ProdutoImpl implements Produto {

	private String nome;
	private int quantidade;

	ProdutoImpl(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	@Override
	public void adicionarQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}

	@Override
	public void removerQuantidade(int quantidade) {
		if (quantidade > this.quantidade) {
			System.out.println("Quantidade no estoque " +
			"insuficiente");
		}

		else {
			this.quantidade -= quantidade;
		}
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public int getQuantidade() {
		return quantidade;
	}
}

public class Main {

	public static void main(String[] args) {

		ProdutoImpl produto = new ProdutoImpl("PC", 100);

		System.out.println("\n--- Quantidade Inicial ---");
		System.out.println(produto.getQuantidade());

		System.out.println("\n--- Tentar remover 150 ");
		produto.removerQuantidade(150);
		System.out.println(produto.getQuantidade());

		System.out.println("\n--- Remover 100 ");
		produto.removerQuantidade(100);
		System.out.println(produto.getQuantidade());

		System.out.println("\n--- Adicionar 50 ---");
		produto.adicionarQuantidade(50);
		System.out.println(produto.getQuantidade());

		System.out.println("\n --- Detalhes do Produto ---");
		System.out.println("Produto: " + produto.getNome() + 
			" - Quantidade: " + produto.getQuantidade());

	}
}