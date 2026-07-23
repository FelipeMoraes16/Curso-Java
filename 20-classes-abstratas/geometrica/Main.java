package geometrica;

/**
 * Objetivo: Praticar a criação e utilização de classes 
 * abstratas e a implementação de métodos abstratos em Java.
 */

abstract class FiguraGeometrica {

	abstract void calcularArea();

	abstract void calcularPerimetro();
}

class Retangulo extends FiguraGeometrica {

	private int base;
	private int altura;

	Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void calcularArea(){
		System.out.println("Área do retângulo: " + 
			(base * altura));
	}

	@Override
	public void calcularPerimetro() {
		System.out.println("Perímetro do retângulo: " + 
			(2 * (base + altura)));
	}
}

public class Main {

	public static void main(String[] args) {

		Retangulo retangulo = new Retangulo(10, 5);

		retangulo.calcularArea();
		retangulo.calcularPerimetro();

	}
}