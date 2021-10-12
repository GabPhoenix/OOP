package herança;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome, cor="", ambiente="", caracteristica="";
		double velocidade, comprimento;
		int numeroDePatas=0, opt;
		
		Animal a = null;
		Peixe p = null;
		Mamifero m = null;
		
		ArrayList<Animal> animais = new ArrayList<Animal>();
		
		do{
			System.out.println("Para inserir os dados relativos a um peixe, digite 1 \n"+
					"Para inserir dados relativos a um mamifero, digite 2; \n"+
					"Para listar todos os animais cadastrados, digite 3; \n"+
					"Para listar todos peixes, digite 4 \n"+
					"Para sair, digte 0; \n"+
					"O que deseja fazer?");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt){
			case 1:
				System.out.println("Informe o nome do peixe: ");
				nome = sc.nextLine();
				System.out.println("Informe a velocidade do peixe em m/s:");
				velocidade = sc.nextDouble();
				System.out.println("Informe o comprimento do peixe:");
				comprimento = sc.nextDouble();
				
				animais.add(p = new Peixe(nome, "cinza", comprimento, velocidade, "barbatanas e cauda", "mar", 0));
				System.out.println("Animal cadastrado com sucesso!");
				break;
			case 2:
				System.out.println("Informe o nome do mamífero: ");
				nome = sc.nextLine();
				System.out.println("Informe a cor do mamífero: ");
				cor = sc.nextLine();
				System.out.println("Informe a velocidade do mamífero em m/s: ");
				velocidade = sc.nextDouble();
				System.out.println("Informe o comprimento do mamífero: ");
				comprimento = sc.nextDouble();
				System.out.println("Informe o número de patas: ");
				numeroDePatas = sc.nextInt();
				sc.nextLine();
				System.out.println("Informe o alimento preferido do animal: ");
				caracteristica = sc.nextLine();
				
				animais.add(m = new Mamifero(nome, cor, comprimento, velocidade, "terra", caracteristica, numeroDePatas));
				
				System.out.println("Animal cadastrado com sucesso!");
				break;
			case 3:
				for(int i=0; i<animais.size();i++) {
					System.out.println("------------------------------------------");
					System.out.println("nome: "+animais.get(i).getNome());
					System.out.println("cor: "+animais.get(i).getCor());
					System.out.println("comprimento: "+animais.get(i).getComprimento());
					System.out.println("velocidade: "+animais.get(i).getVelocidade());
					if(animais.get(i) instanceof Peixe) {
						System.out.println("ambiente: "+p.getAmbiente());
						System.out.println("cor: "+p.getCor());
						System.out.println("caracteristica: "+p.getCaracteristica());
						System.out.println("número de Patas: "+p.getPatas());
					}
						else
							System.out.println("ambiente: "+m.getAmbiente());
							System.out.println("comida preferida: "+m.getCaracteristica());
							System.out.println("número de patas: "+m.getPatas());
					
					System.out.println("------------------------------------------");
				}
				break;
			case 4:
				for(int i=0; i<animais.size();i++) {
					if(animais.get(i) instanceof Peixe) {
						System.out.println("------------------------------------------");
						System.out.println("nome: "+animais.get(i).getNome());
						System.out.println("cor: "+animais.get(i).getCor());
						System.out.println("ambiente: "+p.getAmbiente());
						System.out.println("caracteristica: "+p.getCaracteristica());
						System.out.println("comprimento: "+animais.get(i).getComprimento());
						System.out.println("velocidade: "+animais.get(i).getVelocidade());
						System.out.println("número de patas: "+p.getPatas());
						System.out.println("------------------------------------------");
					}
				}
				break;
			}
			
		}while(opt!=0);
		

	}

}
