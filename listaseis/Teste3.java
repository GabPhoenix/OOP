package aulas.listaseis;

import java.util.Scanner;

public class Teste3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoas p;
		p = null;
		String nome;
		double peso, altura;
		int opt;
		
		do {
			System.out.println("Para cadastrar uma pessoa, digite 1;");
			System.out.println("Para mostrar pessoas abaixo do peso, digite 2;");
			System.out.println("Para mostrar pessoas no peso ideal, digite 3;");
			System.out.println("Paar mostrar pessoas aciama do peso, digite 4;");
			System.out.println("Para sair, digite 0");
			System.out.println("O que deseja realizar? ");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt) {
			case 1:
				System.out.println("Informe o nome da pessoa: ");
				nome = sc.nextLine();
				System.out.println("informe o peso da pessoa: ");
				peso = sc.nextDouble();
				System.out.println("Informe a altura da pessoa: ");
				altura = sc.nextDouble();
				
				p = new Pessoas(nome, peso, altura);
				break;
			case 2:
				if(p.imc() < 18.5) {
					System.out.println(p.getNome());
				}
				else
					System.out.println("Não existem pessoas abaixo do peso entre os cadastrados!");
				break;
			case 3:
				if(p.imc() > 18.5 && p.imc() < 25) {
					System.out.println(p.getNome());
				}
				else
					System.out.println("Não existem pessoas com peso ideal entre os cadastrados!");
				break;
			case 4:
				if(p.imc() >= 25) {
					System.out.println(p.getNome());
				}
				else
					System.out.println("Não existem pessoas acima do peso entre os cadastrados!");
				break;
			}
			
		} while(opt!=0);
		
	}

}
