package aulas.listacinco;

public class Estudante {
	private String nome;
	private int numeroDeMatricula;
	private String endereco;
	private double[] notas;
	
	public Estudante(String nome, int numeroDeMatricula, String endereco, double[] notas) {
		this.nome = nome;
		this.numeroDeMatricula = numeroDeMatricula;
		this.endereco = endereco;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double media() {
		int soma = 0;
		for(int i=0; i<notas.length; i++) {
			soma+= notas[i];
		}
		return soma/4;
	}
}
