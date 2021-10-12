package hp1;

import java.util.ArrayList;

public class Teste_Pessoa {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Rica r;
		Pobre p;
		Miseravel m;
		
		pessoas.add(r = new Rica("Maria", 40, 70000));
		pessoas.add(p = new Pobre("Gabriel", 18));
		pessoas.add(m = new Miseravel("Jubiscleu", 30));
		
		for(int i=0;i<pessoas.size();i++) {
			//rica
			if(pessoas.get(i) instanceof Rica) {
				r.fazCompras(10000);
				System.out.println(pessoas.get(i).getNome());
				System.out.println(pessoas.get(i).getIdade());
				System.out.println(r.getDinheiro());
			}
			if(pessoas.get(i) instanceof Pobre) {
				System.out.println(pessoas.get(i).getNome());
				System.out.println(pessoas.get(i).getIdade());
				p.trabalha();
			}
			if(pessoas.get(i) instanceof Miseravel) {
				System.out.println(pessoas.get(i).getNome());
				System.out.println(pessoas.get(i).getIdade());
				m.mendiga();
			}
		}
		
	}

}
