package aulas.listaseis;

public class Carro {
	private int eficiencia;
	private int quilometragem;
	private int combustivel;
	
	public Carro(int eficiencia, int combustivel, int quilometragem) {
		this.eficiencia = eficiencia;
		this.combustivel = combustivel;
		this.quilometragem = quilometragem;
	}

	public double getEficiencia() {
		return eficiencia;
	}

	public void setEficiencia(int eficiencia) {
		this.eficiencia = eficiencia;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	
	public int andar() {
		int a = (combustivel*eficiencia)/quilometragem;
		return a;
	}
}
