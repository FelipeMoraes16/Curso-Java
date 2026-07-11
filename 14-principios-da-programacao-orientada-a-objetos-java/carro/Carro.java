package carro;

public class Carro {

	private String marcaDoCarro;
	private String modeloDoCarro;
	private int anoDoCarro;

	public Carro () {
		marcaDoCarro = "Desconhecida";
		modeloDoCarro = "Desconhecido";
		anoDoCarro = 0;
	}

	public Carro (String marca, String modelo) {
		marcaDoCarro = marca;
		modeloDoCarro = modelo;
		anoDoCarro = 0;
	}

	public Carro (String marca, String modelo, int ano) {
		marcaDoCarro = marca;
		modeloDoCarro = modelo;
		anoDoCarro = ano;
	}

	public void exibirDetalhes() {
		System.out.println("Marca: " + marcaDoCarro);
		System.out.println("Modelo: " + modeloDoCarro);
		System.out.println("Ano: " + anoDoCarro);
		System.out.println();
	}
}