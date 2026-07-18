package teste_metodo;

/**
 * Objetivo: Demonstrar o uso da palavra-chave 
 * final em métodos de classes Java.
 */

class Calculadora {
	
	final int somar(int a, int b) {

		return a + b;
	}
}

class CalculadoraCientifica extends Calculadora {

	/**
	 * Se descomentar o método abaixo dará erro 
	 * pois um método final não pode ser sobrescrito
	 */
	// @Override
	// final int somar(int a, int b) {
	// 	return a + b + 10;
	// }
}

public class Main {

	public static void main(String[] args) {

		Calculadora c = new Calculadora();

		System.out.println(c.somar(10, 2));
	}
}