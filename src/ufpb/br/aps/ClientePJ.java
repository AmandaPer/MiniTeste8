package ufpb.br.aps;

public class ClientePJ extends Cliente {

	private String razaoSocial;
	private String cnpj;
	
	public ClientePJ(String razaoSocial, String cnpj) {
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
