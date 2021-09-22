/*Escreva um programa que receba o nome e o salário de vários
funcionários. Escreva um método que receba os nomes e os salários e retorne o nome
dos funcionários que recebem mais que R$ 5.000,00. Obs.: O número de funcionários
deve ser informado pelo usuário.*/


package aulas.listaquatro;

import java.util.Scanner;

public class Ex1Lista4 {
	static String[] above(int quant, String[] nomes, double[] salarios) {
		int count = 0;
		String[] empAbove = new String[quant];
		for(int i=0; i<salarios.length; i++) {
			if(salarios[i]>5000) {
				empAbove[count]= nomes[i];
				count++;
			}
		}
		return empAbove;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount;
		
		System.out.println("Quantos funcionários deseja cadastrar? ");
		amount = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[amount];
		double[] salarios = new double[amount];
		
		for(int i=0; i<amount; i++) {
			System.out.println("Informe o nome: ");
			nomes[i]+=sc.next();
			System.out.println("Informe o salário: ");
			salarios[i]+=sc.nextDouble();
		}
		
		String abvWage[] = above(amount, nomes, salarios);
		
		for(int i=0; i<abvWage.length; i++) {
			if(abvWage[i] != null) {
				System.out.println(abvWage[i]);
			}
		}
	}

}
