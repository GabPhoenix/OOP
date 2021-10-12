package herança;

public class Peixe extends Animal{
	private String caracteristica, ambiente;
	private int patas;
	public Peixe(String nome, String cor, double comprimento, double velocidade,  String caracteristica,
			String ambiente, int patas) {
		super(nome, cor, comprimento, velocidade);
		this.caracteristica = caracteristica;
		this.ambiente = ambiente;
		this.patas = patas;
	}
	
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
	
}
