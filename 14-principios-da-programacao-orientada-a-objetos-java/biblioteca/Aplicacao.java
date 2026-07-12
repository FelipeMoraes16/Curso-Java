package biblioteca;

/**
 * Objetivo: Praticar o uso e acesso de diferentes
 * modificadores de acesso, e o uso de sobrecarga 
 * de construtores.
 */

public class Aplicacao {

	public static void main(String[] args) {

		Livro livro1 = new Livro();
		Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien");
		Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis",
			1899, 32.50);

		System.out.println("--- Detalhes do livro1 ---");
		System.out.println("Título: " + livro1.titulo);
		System.out.println("Autor: " + livro1.getAutor());
		System.out.println("Ano de publicação: " 
			+ livro1.anoPublicacao);
		System.out.println("Preço: " + livro1.preco);
	}

}