package sobrescrita;

/**
 * Objetivo: Demonstrar o uso correto da anotação @Override 
 * para sobrescrever métodos em classes Java e entender os 
 * problemas que podem surgir sem ela.
 */

class SuperClasse {

	// Este método imprime() será sobrescrito
	// pela classe filha MinhaClasse().
	public void imprime() {
		System.out.println("imprime"); 
	}
}

class MinhaClasse extends SuperClasse {

	// Com o @Override o compilador só vai compilar 
	// o código se a classe pai tiver um método com 
	// o mesmo nome do método e paramêtros iguais ao da filha 
	// para sobrescrever, caso contrário ele não vai compilar.
	@Override
	public void imprime() {
		System.out.println("imprime diferente");
	}
}


public class TesteOverride {

	public static void main(String[] args) {

		MinhaClasse mc = new MinhaClasse();

		mc.imprime();

	}
}