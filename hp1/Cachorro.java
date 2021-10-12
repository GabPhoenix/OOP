package hp1;

public class Cachorro extends Animal{

	public Cachorro() {
		super();
	}

	public Cachorro(String nome, String raça) {
		super(nome, raça);
	}
	
	public void late() {
		System.out.println("AUAU");
	}
	
}
