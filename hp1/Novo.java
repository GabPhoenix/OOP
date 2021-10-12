package hp1;

public class Novo extends Imovel{

	private double adicional;

	public Novo(double preço, double adicional) {
		super(preço);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}


	@Override
	public void valor() {
		System.out.println(this.getPreço()+adicional);
	}
}
