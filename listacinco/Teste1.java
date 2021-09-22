package aulas.listacinco;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[4];
		Estudante e;
		int opcao, matricula = 0;
		String nome = "", endereco = "";
		e = null;
		
		while(true) {
			System.out.println("Para criar um novo estudante, digite 1;");
			System.out.println("Para calcular a média, digite 2;");
			System.out.println("Para obter o número de matrícula, digite 3;");
			System.out.println("Para obter o endereco, digite 4;");
			System.out.println("Para sair, digite 0;");
			System.out.println("O que deseja fazer? ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Informe o nome do aluno: ");
				nome = sc.nextLine();
				
				System.out.println("Informe o número de matrícula: ");
				matricula = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Informe o endereco do aluno: ");
				endereco = sc.nextLine();
				
				for(int i=0; i<notas.length; i++) {
					System.out.println("Informe as notas: ");
					notas[i]+= sc.nextDouble();
				}
				
				e = new Estudante(nome, matricula, endereco, notas);
				break;
			case 2:
				System.out.println("A média do aluno é "+ e.media());
				break;
			case 3:
				System.out.println("A matrícula do aluno é "+ e.getNumeroDeMatricula());
				break;
			case 4:
				System.out.println("O endereço do aluno é "+ e.getEndereco());
			}
		}
	}

}
