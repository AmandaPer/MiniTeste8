package ufpb.br.aps;

public class VendaBuilder {
	
	private Venda venda;
	
	public VendaBuilder(){
		venda = new Venda();
	}
	
	public Venda build() {
		return this.venda;
	}
	public VendaBuilder data(String data) {
		venda.setData(data);
		return this;
	}
	
	public VendaBuilder clientePF(String nome, String cpf) {
		Cliente clientePF = new ClientePF(nome, cpf);
		venda.setCliente(clientePF);
		return this;
	}
	
	public VendaBuilder clientePJ(String razaoSocial, String cnpj) {
		Cliente clientePJ = new ClientePJ(razaoSocial, cnpj);
		venda.setCliente(clientePJ);
		return this;
	}
	
	public VendaBuilder frete(double valor) {
		Frete frete = new Frete(valor);
		venda.setFrete(frete);
		return this;
	}
	
	public VendaBuilder itemVenda(int quant, Produto produto) {
		ItemVenda item = new ItemVenda(quant, produto);
		venda.addItem(item);
		return this;
	}
	
	public VendaBuilder funcionario(String nome) {
		Funcionario funcionario = new Funcionario(nome);
		venda.setFuncionario(funcionario);
		return this;
	}

}