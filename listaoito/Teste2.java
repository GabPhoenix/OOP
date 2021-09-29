package aulas.listaoito;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> array = new ArrayList<Conta>();
		Conta acc = null;
		Cliente c = null;
		Banco b = null;
		String nome, cpf, nome_agencia;
		int opt, numero_conta = 0, saldo = 0, num_agencia;
		
		do {
			System.out.println("Para cadastrar uma conta, digite 1;");
			System.out.println("Para realizar um depósito, digite 2;");
			System.out.println("Para realizar saque, digite 3;");
			System.out.println("Para verificar o saldo, digite 4");
			System.out.println("Para consultar agência, digite 5");
			System.out.println("Para trocar de agência, digite 6");
			System.out.println("Para sair, digite 0;");
			System.out.println("O que deseja fazer?");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch(opt) {
			case 1:
				if(array.size()<10) {
					System.out.println("Informe o do cliente: ");
					nome = sc.nextLine();
					System.out.println("Informe o cpf do cliente: ");
					cpf = sc.nextLine();
					System.out.println("Informe o número da agência: ");
					num_agencia = sc.nextInt();
					sc.nextLine();
					System.out.println("Informe o nome da agência: ");
					nome_agencia = sc.nextLine();
					numero_conta += 1;
					
					c = new Cliente(nome, cpf);
					b = new Banco(nome_agencia, num_agencia);
					array.add(acc = new Conta(numero_conta, saldo, b, c));
				}
				else 
					System.out.println("O número de cadastrados excedeu o limite!");
				break;
			case 2:
				System.out.println("Informe o cpf do cliente: ");
				String cpf_dep = sc.nextLine();
				for(int i=0; i<array.size();i++) {
					if(array.get(i).getCliente().getCpf().equals(cpf_dep)) {
						System.out.println("Informe o valor do depósito: ");
						double valor_dep = sc.nextDouble();
						if(valor_dep > 0) {
							acc.deposito(valor_dep);
							System.out.println("Valor depositado com sucesso!");
						}
						else
							System.out.println("Impossível realizar o depósito!");
					}
				}
				break;
			case 3:
				System.out.println("Informe o cpf do cliente: ");
				String cpf_saque = sc.nextLine();
				for(int i=0; i<array.size();i++) {
					if(array.get(i).getCliente().getCpf().equals(cpf_saque)) {
						System.out.println("Informe o valor do saque: ");
						double valor_saque = sc.nextDouble();
						if(array.get(i).getSaldo()-valor_saque>0) {
							acc.saque(valor_saque);
							System.out.println("Saque realizado com sucesso!");
						}
						else
							System.out.println("Impossível realizar o saque!");
					}
				}
				break;
			case 4:
				System.out.println("Informe o cpf do cliente: ");
				String consultar_saldo = sc.nextLine();
				for(int i=0; i<array.size();i++) {
					if(array.get(i).getCliente().getCpf().equals(consultar_saldo)) {
						System.out.println("R$ "+ array.get(i).getSaldo());
					}
				}
				break;
			case 5:
				System.out.println("Informe o cpf do cliente: ");
				String consulta_agencia = sc.nextLine();
				for(int i=0;i<array.size();i++) {
					if(array.get(i).getCliente().getCpf().equals(consulta_agencia)) {
						System.out.println("Nome da agência: "+ array.get(i).getBanco().getNome_agencia());
						System.out.println("Número da agência: "+ array.get(i).getBanco().getNumero_agencia());
					}
				}
				break;
			case 6:
				System.out.println("Informe o nome do cliente: ");
				String trocar_agencia = sc.nextLine();
				for(int i=0; i<array.size();i++) {
					if(array.get(i).getCliente().getNome().equals(trocar_agencia)) {
						System.out.println("Informe qual o número da nova agência: ");
						String nova_agencia_nome = sc.nextLine();
						System.out.println("Informe o número da nova agência: ");
						int nova_agencia_num = sc.nextInt();
						sc.nextLine();
						acc.getBanco().setNome_agencia(nova_agencia_nome);
						acc.getBanco().setNumero_agencia(nova_agencia_num);
						System.out.println("Agência trocada com sucesso!");
					}
				}
				break;
			}
			
			
		}while(opt!=0);
		
	}

}
