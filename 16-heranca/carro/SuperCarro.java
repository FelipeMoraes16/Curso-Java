package carro;

/**
 * Objetivo: Entender como a palavra-chave super 
 * é usada para chamar métodos da superclasse em 
 * Java.
 */

class Veiculo {

	void acelerar(){
		System.out.println("Veículo acelerando!");
	}
}

class Carro extends Veiculo {
	void acelerar() {
		super.acelerar();
		System.out.println("Carro acelerando!");
	}
}

public class SuperCarro {

	public static void main(String[] args) {

		Carro car = new Carro();

		car.acelerar();
	}
}