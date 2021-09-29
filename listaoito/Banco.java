package aulas.listaoito;

public class Banco {
	private String nome_agencia;
	private int numero_agencia;
	
	public Banco(String nome_agencia, int numero_agencia) {
		this.nome_agencia = nome_agencia;
		this.numero_agencia = numero_agencia;
	}

	public String getNome_agencia() {
		return nome_agencia;
	}

	public void setNome_agencia(String nome_agencia) {
		this.nome_agencia = nome_agencia;
	}

	public int getNumero_agencia() {
		return numero_agencia;
	}

	public void setNumero_agencia(int numero_agencia) {
		this.numero_agencia = numero_agencia;
	}
	
}
