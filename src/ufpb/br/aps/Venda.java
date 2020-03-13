package ufpb.br.aps;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private String data;
	private Cliente cliente;
	private Frete frete;
	private Funcionario funcionario;
	private List<ItemVenda> listaItens = new ArrayList <ItemVenda>();
	
	public Venda() {
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<ItemVenda> getListaItens() {
		return listaItens;
	}

	public void setListaItens(List<ItemVenda> listaItens) {
		this.listaItens = listaItens;
	}

	public void addItem(ItemVenda item) {
		this.listaItens.add(item);
	}

}
