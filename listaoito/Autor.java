package aulas.listaoito;

public class Autor {
	private String nome, cpf, endere�o;
	
	public Autor(String nome, String cpf, String endere�o) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
}
