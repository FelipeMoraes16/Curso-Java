package restaurante;

import java.text.DecimalFormat;

/**
 * Objetivo: Criar uma interface chamada PedidoRestaurante 
 * que define métodos para adicionar itens ao pedido e calcular 
 * o valor total.
 */

interface PedidoRestaurante {

	void adicionarItem(String item, double preco);

	void calcularTotal(double preco); 
}

class Pedido implements PedidoRestaurante {

	private double totalPedido = 0.0;
	private StringBuilder listaPedidos = new StringBuilder();
	private DecimalFormat decimal = new DecimalFormat("#,##0.00");

	@Override
	public void adicionarItem(String item, double preco) {
		listaPedidos.append("Item: " + item + " - Preço: R$ " + 
			decimal.format(preco) + "\n");
		calcularTotal(preco);
	}

	@Override
	public void calcularTotal(double preco) {
		totalPedido += preco;
	}

	public void mostrarPedido() {
		System.out.println("--- Detalhes do Pedido ---");
		System.out.println(listaPedidos);
		System.out.println("Total do Pedido: R$ " + 
			decimal.format(totalPedido));
	}

}

public class Main {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();

		pedido.adicionarItem("Hambúrguer", 10.00);
		pedido.adicionarItem("Batata Frita", 7.50);
		pedido.adicionarItem("Refrigerante", 5.00);

		pedido.mostrarPedido();
		
	}
}