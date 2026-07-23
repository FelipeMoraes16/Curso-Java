package comercio;

/**
 * Objetivo: praticar a criação e utilização de classes 
 * abstratas e a implementação de métodos concretos em Java.
 */

abstract class Loja {

	String cnpj;
	String razaoSocial;
	boolean lojaAberto;

	Loja (String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	void abrirLoja() {
		lojaAberto = true;
		mostrarMensagem();
	}

	void fecharLoja(){
		lojaAberto = false;
		mostrarMensagem();
	}

	void mostrarMensagem() {
		System.out.println("\n--- Detalhes da Loja ---");
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Razão Social: " + razaoSocial);
		System.out.println("Loja aberta: " + lojaAberto);
	}
}

class LojaComercial extends Loja{

	LojaComercial(String cnpj, String razaoSocial) {
		super(cnpj, razaoSocial);
	}
}

public class Main {

	public static void main(String[] args) {

		LojaComercial loja = new LojaComercial("11.111.111/1111-11", 
			"Fulano Móveis Planejados LTDA");

		loja.abrirLoja();
		loja.fecharLoja();
	}
}