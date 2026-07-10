/**
 * Objetivo: Verificar uma lista de carteirinha de um hospital,
 * para ver qual é aceito, qual não é, e existe um código que
 * finaliza o programa, para fazer isso utilizando o loop for
 * junto com o if.
 */

public class ListaCarteirinha {

	public static void main(String[] args) {

		int codigoSaida = 9;

		for (int codigoCarteirinha = 1; codigoCarteirinha <= 10;
			codigoCarteirinha++) {

			if (codigoCarteirinha == codigoSaida) {
				System.out.println("Código: " + codigoCarteirinha +
					" é o código de saída! Programa encerrado!");
				break;	
			}

			if (codigoCarteirinha == 3 || codigoCarteirinha == 7 ||
				codigoCarteirinha == 10) {

				System.out.println("Código: " + codigoCarteirinha +
					" aceito!");
				continue;
			}

			System.out.println("Código: " + codigoCarteirinha +
				" não é aceito!");
		}
	}
}