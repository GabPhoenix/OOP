package aulas.listaoito;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livro l = null;
		Autor a = null;
		Editora e = null;
		String nome, cpf, ed_nome, end_autor, end_edit, cnpj, telefone, titulo;
		int opt, ano_De_Edi��o, ISBN;
		ArrayList<Livro> array = new ArrayList<Livro>();
		
		do {
			System.out.println("Para cadastrar um livro, digite 1;");
			System.out.println("Para buscar um livro, digite 2;");
			System.out.println("Para listar livros por autor, digite 3;");
			System.out.println("Para listar todos os livros, digite 4;");
			System.out.println("Para sair, digite 0;");
			System.out.println("O que deseja fazer? ");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt) {
			case 1:
				//informa��es do autor
				System.out.println("Informe o nome do autor: ");
				nome = sc.nextLine();
				System.out.println("Informe o cpf do autor: ");
				cpf = sc.nextLine();
				System.out.println("Informe o endere�o do autor: ");
				end_autor = sc.nextLine();
				
				//informa��es da editora
				System.out.println("Informe o nome da editora: ");
				ed_nome = sc.nextLine();
				System.out.println("Informe o CNPJ da editora: ");
				cnpj = sc.nextLine();
				System.out.println("Informe o endere�o da editora: ");
				end_edit = sc.nextLine();
				System.out.println("Informe o telefone da editora: ");
				telefone = sc.nextLine();
				
				//informal��es do livro
				System.out.println("Informe o t�tulo do livro: ");
				titulo = sc.nextLine();
				System.out.println("Informe o ano de edi��o: ");
				ano_De_Edi��o = sc.nextInt();
				sc.nextLine();
				System.out.println("Informe o ISBN do livro: ");
				ISBN = sc.nextInt();
				sc.nextLine();
				
				a = new Autor(nome, cpf, end_autor);
				e = new Editora(cnpj, ed_nome, end_edit, telefone);
				array.add(l = new Livro(a, e, titulo, ISBN, ano_De_Edi��o));
				
				break;
			case 2:
				System.out.println("Informe o t�tulo do livro que deseja buscar: ");
				String busca = sc.nextLine();
				for(int i=0;i<array.size();i++) {
					if(array.get(i).getTitulo().equals(busca)) {
						System.out.println("Autor: "+ array.get(i).getAutor().getNome());
						System.out.println("Editora: "+ array.get(i).getEditora().getNome());
						System.out.println("Ano de edi��o: "+ array.get(i).getAno_De_Edi��o());
						System.out.println("ISBN: "+ array.get(i).getISBN());
					}
				}
				break;
			case 3:
				System.out.println("Informe o nome do autor: ");
				String aut = sc.nextLine();
				for(int i=0; i<array.size();i++) {
					if(array.get(i).getAutor().getNome().equals(aut)) {
						System.out.println(array.get(i).getTitulo());
					}
				}
				break;
			case 4:
				for(int i=0;i<array.size();i++) {
					System.out.println(array.get(i).getTitulo());
				}
				break;
			}
			
		}while(opt!=0);
		
	}

}
