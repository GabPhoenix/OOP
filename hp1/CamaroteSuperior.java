package hp1;

public class CamaroteSuperior extends Vip{
	private double valorAddVip;

	public CamaroteSuperior(double valor, double adicional, double valorAddVip) {
		super(valor, adicional);
		this.valorAddVip = valorAddVip;
	}

	public double getValorAddVip() {
		return valorAddVip;
	}

	public void setValorAddVip(double valorAddVip) {
		this.valorAddVip = valorAddVip;
	}
	
	@Override
	public double getValor() {
		return super.getValor();
	}

	@Override
	public void setValor(double valor) {
		super.setValor(valor+valorAddVip);
	}

	@Override
	public double imprimeValor() {
		return super.imprimeValor()+valorAddVip;
	}
	
}
