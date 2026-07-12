package entidade;

/**
 * Objetivo: Praticar o uso de getters e setters
 * com os modificadores de acesso.
 */

public class Aplicacao {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		pessoa.nome = "João";
		pessoa.setIdade(20);
		pessoa.setEndereco("Rua Tal, 123, Bairro Tal");
		pessoa.setTelefone("9999-9999");

		System.out.println("--- Dados Pessoais ---");
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Endereço: " + pessoa.getEndereco());
		System.out.println("Telefone: " + pessoa.getTelefone());
	}
}