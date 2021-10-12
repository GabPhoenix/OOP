package hp1;

public class TesteImovel {

	public static void main(String[] args) {
		double valor = 140000;
		double adicional = 60000;
		double desconto = 40000;
		
		Novo n = new Novo(valor, adicional);
		n.valor();
		
		Velha v = new Velha(valor, desconto);
		v.valor();

	}

}
