/**
 * Objetivo: Preencher um Array com números pares
 * e exibi-los em uma linha.
 */

public class NumerosPares {

	public static void main(String[] args) {

		int tamanho = 6;

		StringBuilder impressao = new StringBuilder();

		int[] meuArray = new int[tamanho];

		meuArray[0] = 2;
		meuArray[1] = 4;
		meuArray[2] = 6;
		meuArray[3] = 8;
		meuArray[4] = 10;
		meuArray[5] = 12;

		for(int i = 0; i < meuArray.length; i++) {
			if(i == (meuArray.length - 1)){
				impressao.append(meuArray[i] + ".");
				continue;
			}

			impressao.append(meuArray[i] + ", ");
		}

		System.out.println(impressao);
	}
}