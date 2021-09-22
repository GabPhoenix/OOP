package aulas.listacinco;

import java.util.Scanner;

public class teste3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circulo c = null;
		int opcao;
		double raio = 0;
		
		while(true) {
			System.out.println("Para criar um círculo, digite 1; \r\n"
					+ "Para calcular a área, digite 2; \r\n"+
					"Para calular o perímetro digite 3; \r\n"+
					"Para sair digite 0");
			
			System.out.println("Informe o que deseja fazer: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
				case 1:
					System.out.println("Informe o raio: ");
					raio = sc.nextDouble();
					c = new Circulo(raio);
					break;
				case 2:
					System.out.println("A área do círculo é de "+ c.area());
					break;
				case 3:
					System.out.println("O perímetro do círculo é de "+ c.perimetro());
					break;
				case 0:
					System.exit(0);
			}
		}
	}

}
