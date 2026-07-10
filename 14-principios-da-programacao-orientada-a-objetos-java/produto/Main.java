package produto;

/**
 * Objetivo: Testar o conhecimento sobre encapsulamento,
 * utilizando os modificadores de acesso private e public
 * dentro da classe Produto, e um método publico para obter
 * informação das variáveis membros.
 */

public class Main {

	public static void main(String[] args) {

		Produto produto = new Produto("PC", 3000.00, 100);

		produto.obterInfo();
	}
}