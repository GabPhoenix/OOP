package hp1;

public class Velha extends Imovel{
	private double desconto;

	public Velha(double preço, double desconto) {
		super(preço);
		this.desconto = desconto;
	}
	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
	@Override
	public void valor() {
		System.out.println(this.preço-this.desconto);
	}
	
}
