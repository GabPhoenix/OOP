package hp1;

public class CamaroteInferior extends Vip{
	private String localiza��o;

	public CamaroteInferior(double valor, double adicional, String localiza��o) {
		super(valor, adicional);
		this.localiza��o = localiza��o;
	}

	public String getLocaliza��o() {
		return localiza��o;
	}

	public void setLocaliza��o(String localiza��o) {
		this.localiza��o = localiza��o;
	}
	
	public void localiza��o() {
		System.out.println(this.getLocaliza��o());
	}
	
}
