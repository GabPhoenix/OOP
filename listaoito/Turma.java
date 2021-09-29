package aulas.listaoito;

public class Turma {
	private int codigo;
	private Estudante estudante;
	
	public Turma(int codigo, Estudante estudante) {
		this.codigo = codigo;
		this.estudante = estudante;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
	public double media_Da_Turma(int quantidade) {
		double soma = 0;
		soma += estudante.media();
		double media = soma/quantidade;
		return media;
	}
	
}
