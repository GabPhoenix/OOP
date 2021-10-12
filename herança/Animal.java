package herança;

public class Animal {
	private String nome, cor;
	private double comprimento, velocidade;
	
	public Animal(String nome, String cor, double comprimento,
			double velocidade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
