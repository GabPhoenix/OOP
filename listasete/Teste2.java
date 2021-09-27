package aulas.listasete;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p = null;
		String nome;
		int cod, quant, opt;
		double preço;
		ArrayList<Produto> array = new ArrayList<Produto>();
		
		do {
			System.out.println("Para cadastrar um produto, digite 1;");
			System.out.println("Para buscar um produto, digite 2;");
			System.out.println("Para listar todos os produtos, digite 3;");
			System.out.println("Para efetuar uma venda, digite 4;");
			System.out.println("O que deseja fazer? ");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt) {
			case 1:
				System.out.println("Informe o nome do produto:");
				nome = sc.nextLine();
				System.out.println("Informe o preço do produto:");
				preço = sc.nextDouble();
				System.out.println("Informe a quantidade em estoque: ");
				quant = sc.nextInt();
				sc.nextLine();
				System.out.println("Informe o código do produto: ");
				cod = sc.nextInt();
				sc.nextLine();
				
				array.add(p = new Produto(nome, cod, quant, preço));
				break;
			case 2:
				System.out.println("Informe qual produto deseja buscar:");
				String busca = sc.nextLine();
				for(int i=0; i<array.size();i++) {
					if(array.get(i).getNome().equals(busca)) {
						System.out.println(array.get(i).getCodigo());
						System.out.println(array.get(i).getPreço());
						System.out.println(array.get(i).getQuantidade());
					}
				}
				break;
			case 3:
				for(int i=0;i<array.size();i++) {
					System.out.println(array.get(i).getNome());
				}
				break;
			case 4:
				System.out.println("informe qual produto deseja comprar:");
				String venda = sc.nextLine();
				for(int i=0; i<array.size();i++) {
					if(array.get(i).getNome().equals(venda)) {
						if(array.get(i).getQuantidade()>0) {
							System.out.println("Venda realizada com sucesso!");
							int antigo_valor = array.get(i).getQuantidade();
							array.get(i).setQuantidade(antigo_valor -1);
						}
					}
				}
				break;
			}
			
		}while(opt!=0);
	}

}
