package hp1;

public abstract class Imovel {
	protected double pre�o;

	public Imovel(double pre�o) {
		this.pre�o = pre�o;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	public abstract void valor();
	
}
