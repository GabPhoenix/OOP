package aulas.listasete;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, cpf;
		double saldo = 0;
		int opt, numero = 0, agencia; 
		Usuario u = null;
		Conta c = null;
		ArrayList<Conta> acc = new ArrayList<Conta>();
		
		do {
			System.out.println("Para cadastrar uma conta, digite 1;");
			System.out.println("Para realizar depósito, digite 2;");
			System.out.println("Para realizar saque, digite 3;");
			System.out.println("Para verificar saldo, digite 4;");
			System.out.println("Para consultar cliente, digite 5;");
			System.out.println("Para sair, digite 0;");
			System.out.println("O que deseja fazer?");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt) {
			case 1:
				System.out.println("Informe o nome do usuário: ");
				nome = sc.nextLine();
				System.out.println("Informe o cpf: ");
				cpf = sc.nextLine();
				System.out.println("Informe a agencia: ");
				agencia = sc.nextInt();
				sc.nextLine();
				numero+=1;
				
				u = new Usuario(nome, cpf);
				acc.add(c = new Conta(u, numero, agencia, saldo));
				
				break;
			case 2:
				System.out.println("Informe o nome: ");
				String uacc = sc.nextLine();
				for(int i=0; i<acc.size();i++) {
					if(acc.get(i).getDono().getNome().equals(uacc)) {
						System.out.println("Informe o valor do depósito: ");
						double valor_dep = sc.nextDouble();
						double ant_sld = acc.get(i).getSaldo();
						acc.get(i).setSaldo(ant_sld + valor_dep);
						System.out.println("Valor depositado com sucesso! ");
					}
				}
				break;
			case 3:
				System.out.println("Informe o nome: ");
				String uacc2 = sc.nextLine();
				for(int i=0; i<acc.size();i++) {
					if(acc.get(i).getDono().getNome().equals(uacc2)) {
						System.out.println("Informe o valor do saque: ");
						double valor_saq = sc.nextDouble();
						double ant_sld2 = acc.get(i).getSaldo();
						acc.get(i).setSaldo(ant_sld2 - valor_saq);
						System.out.println("Saque realizado com sucesso! ");
					}
				}
				break;
			case 4:
				System.out.println("Informe o nome: ");
				String consulta = sc.nextLine();
				for(int i=0;i<acc.size();i++) {
					if(acc.get(i).getDono().getNome().equals(consulta)) {
						System.out.println("Número da conta: "+acc.get(i).getNumero());
						System.out.println("Saldo disponível R$ "+ acc.get(i).getSaldo());
					}
				}
				break;
			case 5:
				System.out.println("Informe o número da conta: ");
				int num_acc = sc.nextInt();
				sc.nextLine();
				for(int i=0; i<acc.size();i++) {
					if(acc.get(i).getNumero()==num_acc) {
						System.out.println(acc.get(i).getDono().getNome());
						System.out.println(acc.get(i).getDono().getCpf());
					}
				}
				break;
			}
			
		}while(opt!=0);
		
	}

}
