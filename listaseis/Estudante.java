package aulas.listaseis;

public class Estudante {
	private String nome;
	private int matricula;
	private double[] notas;
	
	public Estudante(String nome, int matricula, double[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double mediaDoEstudante() {
		double soma = 0;
		for(int i=0; i<notas.length; i++) {
			soma += notas[i];
		}
		return soma/2;
	}
}
