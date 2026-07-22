package automovel;

/**
 * Objetivo: Praticar a implementação de interfaces 
 * em Java e o uso de métodos padrão (default) em 
 * interfaces.
 */

interface Veiculo {

	void iniciar();

	void parar();

	default void buzinar() {
		System.out.println("Veículo buzinando");
	}

}

class Carro implements Veiculo {

	@Override
	public void iniciar() {
		System.out.println("Carro acelerando.");
	}

	@Override
	public void parar() {
		System.out.println("Carro parando.");
	}
}

class Caminhao implements Veiculo {

	@Override
	public void iniciar() {
		System.out.println("Caminhão acelerando.");
	}

	@Override
	public void parar() {
		System.out.println("Caminhão parando.");
	}
}

public class Main {

	public static void main(String[] args) {

		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();

		carro.iniciar();
		carro.buzinar();

		System.out.println();

		caminhao.iniciar();
		caminhao.buzinar();
	}
}