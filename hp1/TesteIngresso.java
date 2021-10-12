package hp1;

public class TesteIngresso {

	public static void main(String[] args) {
		double valor = 300;
		Normal n = new Normal(valor);
		System.out.println(n.getValor());
		
		CamaroteInferior ci = new CamaroteInferior(valor, 200, "A35");
		ci.localização();
		System.out.println(ci.imprimeValor());
		
		CamaroteSuperior cp = new CamaroteSuperior(valor, 200, 100);
		System.out.println(cp.imprimeValor());

	}

}
