package aulas.listaseis;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario f;
		f = null;
		String nome;
		double salario;
		ArrayList<Funcionario> array = new ArrayList<Funcionario>();
		int opt;
		
		do {
			System.out.println("Para cadastrar um funcionario, digite 1;");
			System.out.println("Para calcular o imposto, digite 2;");
			System.out.println("Para sair, digite 0;");
			System.out.println("O que deseja fazer? ");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt) {
			case 1:
				System.out.println("Informe o nome do funcionário: ");
				nome = sc.nextLine();
				
				System.out.println("Informe o salário do funcionário: ");
				salario = sc.nextDouble();
				
				array.add(f = new Funcionario(nome, salario));
				break;
			case 2:
				System.out.println("Informe o nome do funcionário que deseja verificar o imposto: ");
				if(f.getNome().contentEquals(sc.next())) {
					if(f.getSalario()<=2000) {
						System.out.println("O funcionário não precisa pagar imposto!");
					}
					else if(f.getSalario()>2000 && f.getSalario()<=3500) {
						System.out.println("O funcionário pagará "+ f.getSalario() * 15/100 +" de imposto");
					}
					else if(f.getSalario()>3500 && f.getSalario()<=5000) {
						System.out.println("O funcionário pagará "+ f.getSalario() * 22/100 +" de imposto");
					}
					else if(f.getSalario()>5000) {
						System.out.println("O funcionário pagará "+ f.getSalario() * 30/100 +" de imposto");
					}
				}
				break;
			}
		} while(opt != 0);

	}

}
