package aulas.listacinco;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo r = null;
		int opcao = 0;
		double base = 0, altura = 0;
		
		
		while(true){
			System.out.println("Para criar um ret�ngulo digite 1;");
			System.out.println("Para calcular a �rea digite 2;");
			System.out.println("Para calcular o per�metro digite 3;");
			System.out.println("Para sair digite 0;");
			
			System.out.println("O que deseja fazer: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
				case 1:
					System.out.println("Informe a base: ");
					base = sc.nextDouble();
					System.out.println("Informe a altura: ");
					altura = sc.nextDouble();
					r = new Retangulo(base, altura);
					break;
				case 2:
					System.out.println("A �rea do ret�ngulo: "+ r.area());
					break;
				case 3:
					System.out.println("O per�metro do ret�ngulo: "+ r.perimetro());
					break;
				case 0:
					System.exit(0);
			}
			
		}
	}

}
