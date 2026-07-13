/**
 * Objetivo: Fazer um programa que calcule a soma
 * dos números de 1 até 1000 e exibir o resultado.
 */

public class SomaDeMil {

	public static void main(String[] args) {

		int soma = 0;

		int[] numeros = new int[1000];

		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			soma += numeros[i];
		}

		System.out.println("Soma dos números de 1 até 1000 é "
			+ soma);
	}
}