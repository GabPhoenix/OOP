package hp1;

public class Animal {
	private String nome, raça;

	public Animal(String nome, String raça) {
		this.nome = nome;
		this.raça = raça;
	}

	public Animal() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	public void caminha() {
		System.out.println("O animal caminha!");
	}
	
}
