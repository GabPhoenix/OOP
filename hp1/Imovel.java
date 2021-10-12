package hp1;

public abstract class Imovel {
	protected double preço;

	public Imovel(double preço) {
		this.preço = preço;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public abstract void valor();
	
}
