package aulas.listaoito;

public class Autor {
	private String nome, cpf, endereço;
	
	public Autor(String nome, String cpf, String endereço) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
}
