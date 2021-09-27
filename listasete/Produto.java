package aulas.listasete;

public class Produto {
	String nome;
	int codigo, quantidade;
	double pre�o;
	
	public Produto(String nome, int codigo, int quantidade, double pre�o) {
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.pre�o = pre�o;
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

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
}
