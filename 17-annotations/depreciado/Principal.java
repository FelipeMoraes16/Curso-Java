package depreciado;

/**
 * Objetivo: Demonstrar o uso da anotação @SuppressWarnings 
 * para suprimir avisos do compilador relacionados a tipos 
 * de dados não verificados.
 */

class ExemploDepreciado {

	@Deprecated
	public void metodoObsoleto() {
		System.out.println("Este é um método depreciado");
	}
}

public class Principal {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		ExemploDepreciado ed = new ExemploDepreciado();

		ed.metodoObsoleto();
	}
}