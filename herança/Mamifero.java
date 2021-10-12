package herança;

public class Mamifero extends Animal{
	private String ambiente, caracteristica;
	private int patas;
	public Mamifero(String nome, String cor, double comprimento, double velocidade, String ambiente,
			String caracteristica, int patas) {
		super(nome, cor, comprimento, velocidade);
		this.ambiente = ambiente;
		this.caracteristica = caracteristica;
		this.patas = patas;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
