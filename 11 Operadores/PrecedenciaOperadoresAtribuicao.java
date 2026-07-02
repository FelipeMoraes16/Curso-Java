/**
 * Objetivo: Praticar precedência de operadores (++) e (--).
 */

public class PrecedenciaOperadoresAtribuicao {

	public static void main(String[] args) {

		int numero = 5;

		System.out.println("Valor incial de numero: " +
		numero + "\n");// 5

		System.out.println("Pré-Incremento: " + (++numero) + "\n");// 6

		System.out.println("Pós-Incremento: " + (numero++));// 6
		System.out.println("Valor depois do 'Pós-Incremento': " + 
		numero + "\n");// 7

		System.out.println("Pré-Decremento: " + (--numero) + "\n"); // 6

		System.out.println("Pós-Decremento: " + (numero--)); // 6
		System.out.println("Valor depois do 'Pós-Decremento': " + 
		numero + "\n"); // 5
	}
}