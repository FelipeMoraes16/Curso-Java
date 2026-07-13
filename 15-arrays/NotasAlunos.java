/**
 * Objetivo: Praticar o uso de Arrays, criando
 * uma lista de notas e usando um loop para percorrer
 * e imprimir na tela.
 */

public class NotasAlunos {

	public static void main(String[] args) {

		int tamanho = 5;
		StringBuilder impressaoNotas = new StringBuilder();
		double[] listaNotas;

		listaNotas = new double[tamanho];

		listaNotas[0] = 7.5;
		listaNotas[1] = 5.5;
		listaNotas[2] = 8.0;
		listaNotas[3] = 10.0;
		listaNotas[4] = 6.5;

		for(int i = 0; i < listaNotas.length; i++) {

			if(i == (listaNotas.length - 1)) {
				impressaoNotas.append("Nota: " + listaNotas[i]);
				continue;
			}
			
			impressaoNotas.append("Nota: " + listaNotas[i] + ", ");
		}

		System.out.println(impressaoNotas);
	}
}