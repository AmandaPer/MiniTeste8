package ufpb.br.aps;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Teste1 {

	@Test
	void test() {
	Venda venda = new Venda();
	Cliente cliente = new ClientePF("Jose", "000.111.222-34");
	venda.setCliente(cliente);
	Produto banana = new Produto("Banana Maça", 1.00);
	ItemVenda item1 = new ItemVenda(3, banana);
	venda.addItem(item1);
	Produto mamao = new Produto("Mamão", 2.00);
	ItemVenda item2 = new ItemVenda(2, mamao);
	venda.addItem(item2);
	}

	@Test
	void testBuilder() {
		Produto banana = new Produto("Banana Maça", 1.00);
		Produto mamao = new Produto("Mamão", 2.00);
		Venda venda = new VendaBuilder()
						.data("10/03/20")
						.clientePF("Jose", "000.111.222-35")
						.frete(10.00)
						.funcionario("Amanda")
						.itemVenda(3, banana)
						.itemVenda(2, mamao)
						.build();
		Venda venda2 = new VendaBuilder()
						.data("11/03/20")
						.clientePJ("Subway", "555.666.77")
						.frete(10.00)
						.itemVenda(7, banana)
						.itemVenda(8, mamao)
						.funcionario("Carlos")
						.build();
	}
}
