package aulas.listasete;

public class Produto {
	String nome;
	int codigo, quantidade;
	double preço;
	
	public Produto(String nome, int codigo, int quantidade, double preço) {
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
}
