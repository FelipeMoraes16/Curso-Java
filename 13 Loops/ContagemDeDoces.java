/**
 * Objetivo: É criar um programa que conte quantos doces
 * podem ser comidos, mas há um limite que não pode ser
 * ultrapassado, para isso foi usado o loop while.
 */

public class ContagemDeDoces {

	public static void main(String[] args) {

		int limite = 3;
		int doces = 1;

		while(doces <= limite) {
			System.out.println("Doces comidos: " + doces);
			doces++;
		}

		System.out.println("Não pode comer mais doces!");
	}
}