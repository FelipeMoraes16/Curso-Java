/**
 * Objetivo: Verifica qual é o mês baseado no numero fornecido,
 * e mostrar na tela qual é o mês, usando o switch legacy (antes do Java 7).
 * Exemplo: 1 janeiro ate 12 dezembro.
 */

public class VerificadorDeMes {

	public static void main(String[] args) {

		int numeroMes = 6;
		String nomeMes;

		switch (numeroMes) {
			case 1:
				nomeMes = "Janeiro";
				break;
			case 2 :
				nomeMes = "Fevereiro";
				break;
			case 3:
				nomeMes = "Março";
				break;
			case 4:
				nomeMes = "Abril";
				break;
			case 5:
				nomeMes = "Maio";
				break;
			case 6:
				nomeMes = "Junho";
				break;
			case 7:
				nomeMes = "Julho";
				break;
			case 8:
				nomeMes = "Agosto";
				break;
			case 9:
				nomeMes = "Setembro";
				break;
			case 10:
				nomeMes = "Outubro";
				break;
			case 11:
				nomeMes = "Novembro";
				break;
			case 12:
				nomeMes = "Dezembro";
				break;
			default:
				nomeMes = "Mês desconhecido";
				break;
		}

		System.out.println(nomeMes);
	}
}