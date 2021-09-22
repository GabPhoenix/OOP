package aulas.listaseis;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double salario;
		int opt;
		Funcionarios f = new Funcionarios();
		
		ArrayList<Funcionarios> func = new ArrayList<Funcionarios>();
		
		do {
			System.out.println("Para cadastrar um novo funcionário, digite 1;");
			System.out.println("Para exibir os funcionários de alta renda, digite 2;");
			System.out.println("Para sair, digite 0;");
			System.out.println("O que deseja fazer? ");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt) {
			case 1:
				System.out.println("Informe o nome do funcionário: ");
				nome = sc.next();
				System.out.println("Informe o salário do funcionário: ");
				salario = sc.nextDouble();
				
				func.add(new Funcionarios(nome, salario));
				break;
			case 2:
				f.altaRenda(func);
				break;
			}
		}while(opt!=0);
		
	}

}
