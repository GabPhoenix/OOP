package hp1;

import java.util.ArrayList;

public class Teste_animal {

	public static void main(String[] args) {
		Cachorro c;
		Gato g;
		Animal a = null;
		ArrayList<Animal> animais = new ArrayList<Animal>();
		
		animais.add(g = new Gato("cat", "gato"));
		animais.add(c = new Cachorro("dog", "vira-lata"));
		
		for(int i=0; i<animais.size(); i++) {
			// imprimindo todos os cachorros
			if(animais.get(i) instanceof Cachorro) {
				System.out.println("Nome: "+ animais.get(i).getNome());
				System.out.println("Raça: "+ animais.get(i).getRaça());
				c.caminha();
				c.late();
			}
			//imprimindo todos os gatos
			if(animais.get(i) instanceof Gato) {
				System.out.println("Nome: "+ animais.get(i).getNome());
				System.out.println("Raça: "+ animais.get(i).getRaça());
				g.caminha();
				g.mia();
			}
		}		

	}

}
