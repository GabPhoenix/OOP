package aulas.listaquatro;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4lista4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Imposto> array = new ArrayList<Imposto>();
		Imposto im = null;
		String nome;
		double salario;
		int opt;
		do {
			System.out.println("Para cadastrar um funcionário, digite 1;");
			System.out.println("Para calcular o imposto, digite 2;");
			System.out.println("Para sair, digite 0;");
			System.out.println("O que deseja fazer?");
			opt = sc.nextInt();
			sc.nextLine();
			switch(opt){
			case 1:
				System.out.println("Informe o nome: ");
				nome = sc.nextLine();
				System.out.println("Informe o salário: ");
				salario = sc.nextDouble();
				array.add(im = new Imposto(nome, salario));
				break;
			case 2:
				System.out.println("Informe o nome do funcionário: ");
				String verificar = sc.nextLine();
				for(int i=0;i<array.size();i++) {
					if(array.get(i).getNome().equals(verificar)) {
						double quantia = array.get(i).getSalario();
						if(quantia<2000) {
							System.out.println("O funcionário não precisa pagar imposto");
						}
						else if(quantia>2000 && quantia<3500) {
							System.out.println("O funcionário precisa pargar R$"+ quantia*0.15);
						}
						else if(quantia>3500 && quantia<5000) {
							System.out.println("O funcionário precisa pagar R$"+ quantia*0.22);
						}
						else if(quantia>5000) {
							System.out.println("O funcionário precisa pagar R$"+ quantia*0.30);
						}
					}
				}
				break;
			}
			
			
		}while(opt!=0);

	}

}
