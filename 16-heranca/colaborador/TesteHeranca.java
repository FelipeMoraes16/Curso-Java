package colaborador; 

/**
 * Objetivo: Praticar o conceito de Herança, 
 * criando uma classe Assistente que herda da 
 * classe Funcionario e implementar um método 
 * que calcula o salário anual com um bônus fixo.
 */

class Funcionario {

	private String nome;
	private double salario;

	public double ganhoAnual() {
		return salario * 12;
	}

	public void addAumento(double valor) {
		salario += valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

class Assistente extends Funcionario {

	@Override
	public double ganhoAnual() {
		return super.ganhoAnual() + 1000;
	}

}

public class TesteHeranca {

	public static void main(String[] args) {

		Assistente assistente = new Assistente();

		assistente.setNome("João");
		assistente.setSalario(3000);

		assistente.addAumento(500);

		System.out.println("Assistente: " + assistente.getNome());
		System.out.println("Salário anual com bonûs fixo: " 
			+ assistente.ganhoAnual());

	}
}