package aulas.listaseis;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante e;
		double[] notas = new double[2];
		int matricula, opt;
		String nome;
		e = null;
		
		do {
			System.out.println("Para cadastrar um estudante, digite 1;");
			System.out.println("Para obter o nome do estudante, digite 2;");
			System.out.println("Para calcular a média, digite 3;");
			System.out.println("Para sair, digite 4");
			System.out.println("O que deseja fazer? ");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt) {
			case 1:
				System.out.println("Informe o nome do aluno: ");
				nome = sc.nextLine();
				System.out.println("Informe a matrícula: ");
				matricula = sc.nextInt();
				sc.nextLine();
				
				for(int i=0; i<notas.length;i++) {
					System.out.println("Informe a nota: ");
					notas[i]+=sc.nextDouble();
				}
				e = new Estudante(nome, matricula, notas);
				break;
			case 2:
				System.out.println("Informe a matrícula: ");
				int busca = sc.nextInt();
				sc.nextLine();
				if(e.getMatricula() == busca) {
					System.out.println(e.getNome());
				}
				break;
			case 3:
				System.out.println(e.mediaDoEstudante());
				break;
			}
			
		} while(opt != 4);

	}

}
