package teste_classe;

/**
 * Objetivo: Demonstrar o uso da palavra-chave 
 * final em uma classe Java.
 */

final class Veiculo {

	void ligarMotor() {
		System.out.println("Motor ligado");
	}
}

/**
 * Se descomentar a declaração da subclasse abaixo 
 * o compiladora dará erro, porque um classe final 
 * não pode ser extendida.
 */

// class Carro extends Veiculo{

// }

public class Main {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();

		veiculo.ligarMotor();
	}
}