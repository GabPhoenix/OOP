package hp1;

public class Animal {
	private String nome, ra�a;

	public Animal(String nome, String ra�a) {
		this.nome = nome;
		this.ra�a = ra�a;
	}

	public Animal() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	
	public void caminha() {
		System.out.println("O animal caminha!");
	}
	
}
