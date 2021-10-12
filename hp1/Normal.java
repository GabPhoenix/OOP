package hp1;

public class Normal extends Ingresso{

	public Normal(double valor) {
		super(valor);
	}
	
	@Override
	public double imprimeValor() {
		return this.getValor();
	}
	
}
