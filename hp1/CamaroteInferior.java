package hp1;

public class CamaroteInferior extends Vip{
	private String localização;

	public CamaroteInferior(double valor, double adicional, String localização) {
		super(valor, adicional);
		this.localização = localização;
	}

	public String getLocalização() {
		return localização;
	}

	public void setLocalização(String localização) {
		this.localização = localização;
	}
	
	public void localização() {
		System.out.println(this.getLocalização());
	}
	
}
