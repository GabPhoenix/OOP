package aulas.listasete;

import java.util.Scanner;
import java.util.ArrayList;

public class Teste1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livro l = null;
		int opt, anoDeEdicao;
		String autor, editora, ISBN, titulo;
		ArrayList<Livro> livro = new ArrayList<Livro>();
		
		do {
			System.out.println("Para cadastrar um livro, digite 1;");
			System.out.println("Para buscar livro por tilulo, digite 2;");
			System.out.println("Para listar livros por autor, digite 3;");
			System.out.println("Para listar todos os livros, digite 4;");
			System.out.println("Para sair, digite 0;");
			System.out.println("O que deseja fazer? ");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt) {
			case 1:
				System.out.println("Informe o autor: ");
				autor = sc.nextLine();
				
				System.out.println("Informe o título: ");
				titulo = sc.nextLine();
				
				System.out.println("Informe a editora: ");
				editora = sc.nextLine();
				
				System.out.println("Informe o código ISBN");
				ISBN = sc.nextLine();
				
				System.out.println("Informe o ano de edição: ");
				anoDeEdicao = sc.nextInt();
				sc.nextLine();
				
				livro.add(l = new Livro(autor, editora, ISBN, titulo, anoDeEdicao));
				
				break;
			case 2:
				System.out.println("Informe o título do livro: ");
				String nt = sc.nextLine();
				for(int i=0; i<livro.size();i++) {
					if(livro.get(i).getTitulo().equals(nt)) {
						System.out.println("Autor: "+ livro.get(i).getAutor());
						System.out.println("Editora: "+ livro.get(i).getEditora());
						System.out.println("ISBN: "+ livro.get(i).getISBN());
						System.out.println("Ano de edição: "+ livro.get(i).getAnoDeEdicao());
					}
				}
				break;
			case 3:
				System.out.println("Informe o autor do livro: ");
				String na = sc.nextLine();
				for(int i=0; i<livro.size();i++) {
					if(livro.get(i).getAutor().equals(na)) {
						System.out.println("Livros: "+ livro.get(i).getTitulo());
						System.out.println("Editora: "+ livro.get(i).getEditora());
						System.out.println("ISBN: "+ livro.get(i).getISBN());
						System.out.println("Ano de edição: "+ livro.get(i).getAnoDeEdicao());
					}
				}
				break;
			case 4:
				for(int i=0; i<livro.size();i++) {
					System.out.println(livro.get(i).getTitulo());
				}
			}			
			
		} while(opt!=0);
	}

}
