package hp1;

public class Novo extends Imovel{

	private double adicional;

	public Novo(double pre�o, double adicional) {
		super(pre�o);
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
		System.out.println(this.getPre�o()+adicional);
	}
}
