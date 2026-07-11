package carro;

/**
 * Objetivo: Praticar sobrecarga de construtores,
 * criando 3 tipo diferentes de construtores, e
 * criar um método para exibir informações.
 */

public class Aplicacao {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		Carro carro2 = new Carro("Chevrolet", "Onix");
		Carro carro3 = new Carro("Toyota", "Corolla", 2025);

		carro1.exibirDetalhes();
		carro2.exibirDetalhes();
		carro3.exibirDetalhes();
	}
}