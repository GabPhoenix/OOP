package aulas.avaliação1;

public class Poupança extends Conta{
	private double juros;

	public Poupança(int numero, double saldo, Cliente cliente, Banco banco, double juros) {
		super(numero, saldo, cliente, banco);
		this.juros = juros;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	public void renderJuros() {
		this.setSaldo(this.getSaldo()+(this.getSaldo()*juros/100));
		System.out.println("Novo saldo "+ this.getSaldo());
	}
	
}
