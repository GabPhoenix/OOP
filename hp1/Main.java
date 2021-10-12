package hp1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("a)");
		//administrativo
		Administrativo aa = new Administrativo("João", "1298318293", 2000, 1, "noite", 16);
		System.out.println(aa.getMatricula());
		
		//tecnico
		Tecnico at = new Tecnico("Maria", "1290388123", 2000, 2, 10);
		System.out.println(at.getMatricula());
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("b)");
		//cachorro
		Cachorro c = new Cachorro("Dog", "caramelo");
		c.late();
		c.caminha();
		
		//gato
		Gato g = new Gato("Cat", "gato?");
		g.mia();
		g.caminha();
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("c)");
		//Rica
		Rica r = new Rica("João", 18, 200000);
		r.fazCompras(140000); //fazendo compras
		System.out.println("Dinheiro:"+ r.getDinheiro());
		
		//Pobre
		Pobre p = new Pobre("Maria", 18);
		p.trabalha();
		
		//Miseravel
		Miseravel m = new Miseravel("Jubiscleu", 18);
		m.mendiga();
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("d)");
		
		//normal
		System.out.println("Para comprar um ingresso normal, digite 1; \n"+
				"Para comprar um ingresso Vip, digite 2;");
		int opt = sc.nextInt();
		sc.nextLine();
		if(opt == 1) {
			Normal n = new Normal(300);
			System.out.println(n.getValor());
		}
		//Vip
		if(opt==2) {
			System.out.println("Para camarote superior, digite 1; \n"+
					"Para camarote inferior, digite 2;");
			int cmrt = sc.nextInt();
			sc.nextLine();
			
			//camarote superior
			if(cmrt == 1) {
				System.out.println("Camarote Superior");
				CamaroteSuperior cs = new CamaroteSuperior(300, 200, 100);
				System.out.println(cs.imprimeValor());
			}
			
			//camarote inferior
			if(cmrt == 2) {
				System.out.println("Camarote Inferior");
				CamaroteInferior ci = new CamaroteInferior(300, 200, "3b");
				System.out.println("Localização "+ ci.getLocalização());
				System.out.println(ci.imprimeValor());	
			}
		}
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("e)");
		
		double valor = 140000;
		double adicional = 60000;
		double desconto = 40000;
		
		System.out.println("Para comprar um imovel novo, digite 1; \n"+
				"Para comprar um imovel velho, digite 2;");
		int im = sc.nextInt();
		sc.nextLine();
		
		//Novo
		if(im == 1) {
			Novo n = new Novo(valor, adicional);
			n.valor();
		}
		
		//Velho
		if(im == 2) {
			Velha v = new Velha(valor, desconto);
			v.valor();
		}
	}

}
