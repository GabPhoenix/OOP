package aulas.listaoito;

public class Editora {
	private String cnpj, nome, endere�o, telefone;	
	
	public Editora(String cnpj, String nome, String endere�o, String telefone) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
