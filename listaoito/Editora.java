package aulas.listaoito;

public class Editora {
	private String cnpj, nome, endereço, telefone;	
	
	public Editora(String cnpj, String nome, String endereço, String telefone) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereço = endereço;
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
