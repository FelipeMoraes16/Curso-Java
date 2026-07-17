package obsoleto;

/**
 * Objetivo: Praticar a criação e utilização 
 * de métodos em Java, além de entender o uso 
 * da anotação @Deprecated.
 */

class MinhaClasse {

	public int calcularSoma(int a, int b) {
		return a + b;
	}

	@Deprecated
	public int calcularProduto(int a, int b) {
		return a * b;
	}
 }

public class Principal {

	public static void main(String[] args) {

		MinhaClasse mc = new MinhaClasse();

		System.out.println(mc.calcularSoma(10, 2));

		System.out.println(mc.calcularProduto(10, 2));
	}
}