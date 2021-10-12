package hp1;

public class Rica extends Pessoa{
	private double dinheiro;

	public Rica(String nome, int idade, double dinheiro) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public void fazCompras(double valor) {
		this.setDinheiro(this.getDinheiro()-valor);
	}
}
