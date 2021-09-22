package aulas.listaseis;

import java.util.Scanner;

public class Teste5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt;
		int abst, eficiencia, quilometragem;
		Carro c;
		c = null;
		
		
		System.out.println("Quanto de combustível deseja abastecer? ");
		abst = sc.nextInt();
		sc.nextLine();
		
		do {
			System.out.println("Para andar, digite 1;");
			System.out.println("Para reabastecer, digite 2;");
			System.out.println("Para verificar a quantidade de combustível restante, digite 3;");
			System.out.println("Para encerrar a viagem, digite 4;");
			System.out.println("O que deseja fazer? ");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt) {
			case 1:
				System.out.println("Informe a eficiência do carro: ");
				eficiencia = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Informe a quilometragem a ser percorrida: ");
				quilometragem = sc.nextInt();
				sc.nextLine();
				
				c = new Carro(eficiencia, abst, quilometragem);
				if(c.andar()>0) {
					System.out.println("Viagem realizada com sucesso!");
					abst -= quilometragem/eficiencia;
					c.setCombustivel(abst);
				}
				else
					System.out.println("O carro não pussui combustível suficiente :(");
				break;
			case 2:
				System.out.println("Informe a quantidade de combustível a ser abastecida: ");
				abst += sc.nextInt();
				sc.nextLine();
				c.setCombustivel(abst);
				break;
			case 3:
				System.out.println("A quantidade de combustível restante é de "+c.getCombustivel()+"litros");
				break;
			}
		}while(opt!=4);

		System.out.println("Viagem encerrada!");
	}

}
