package aulas.listaoito;

public class Conta {
	private int numero;
	private double saldo;
	private Banco banco;
	private Cliente cliente;
	
	public Conta(int numero, double saldo, Banco banco, Cliente cliente){
		this.banco = banco;
		this.saldo = saldo;
		this.numero = numero;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double deposito(double valor) {
		this.saldo = saldo + valor;
		return saldo;
	}
	
	public double saque(double valor) {
		this.saldo = saldo - valor;
		return saldo;
	}
}
