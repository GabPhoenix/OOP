package herança;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteEmpresa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, cpf, turno, opt, departamento;
		double salario, bonus, adicional=0;
		int matricula = 0;
		Funcionario f = null;
		Gerente g = null;
		Assistente a = null;
		Administrativo aa = null;
		Tecnico at = null;
		
		ArrayList<Funcionario> array = new ArrayList<Funcionario>();
		
		do {
			System.out.println("O que deseja fazer? \n"+
					"Cadastrar funcionario 'f'\n "+
					"Cadastrar gerente 'g' \n"+
					"Cadastrar assistente 'a \n"+
					"Cadastrar assistente administrativo 'aa' \n"+
					"Cadastrar assistente tecnico 'at' \n"+
					"Imprimir todos os funcionarios 'all' \n"+
					"sair 's'");
			opt = sc.nextLine();
			opt.toLowerCase();
			switch(opt){
			case "f":
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Cpf: ");
				cpf = sc.nextLine();
				System.out.println("Salario: ");
				salario = sc.nextDouble();
				
				array.add(f = new Funcionario(nome, cpf, salario));
				
				break;
			case "g":
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Cpf: ");
				cpf = sc.nextLine();
				System.out.println("Informe o departamento: ");
				departamento = sc.nextLine();
				System.out.println("Salario: ");
				salario = sc.nextDouble();
				
				
				array.add(g = new Gerente(nome, cpf, salario, departamento));
				break;
			case "a":
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Cpf: ");
				cpf = sc.nextLine();
				System.out.println("Salario: ");
				salario = sc.nextDouble();
				matricula+=1;
				
				array.add(a = new Assistente(nome, cpf, salario, matricula));
				break;
			case "aa":
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Cpf: ");
				cpf = sc.nextLine();
				System.out.println("Informe o turno: noite/manhã/tarde");
				turno = sc.nextLine();
				System.out.println("Salario: ");
				salario = sc.nextDouble();
				matricula+=1;
				turno.toLowerCase();
				if(turno.equals("noite")){
					System.out.println("Informe a pocentagem");
					adicional = sc.nextDouble();
				}
				array.add(a = aa = new Administrativo(nome, cpf, salario, matricula, turno, adicional));
				break;
			case "at":
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Cpf: ");
				cpf = sc.nextLine();
				System.out.println("Salario: ");
				salario = sc.nextDouble();
				matricula+=1;
				System.out.println("Informe o bonus");
				bonus = sc.nextDouble();
				
				
				array.add(a= at = new Tecnico(nome, cpf, salario, matricula, bonus));
				break;
			case "all":
				for(int i=0;i<array.size();i++) {
					System.out.println("nome: "+ array.get(i).getNome());
					System.out.println("cpf: "+ array.get(i).getCpf());
					System.out.println("salario: "+ array.get(i).getSalario());
					if(array.get(i) instanceof Assistente) {
						System.out.println("matrícula: "+ a.getMatricula());
					}
					else if(array.get(i) instanceof Gerente) {
						System.out.println("departamento: "+ g.getDepartamento());
					}
					else if(array.get(i) instanceof Administrativo) {
						System.out.println("matrícula: "+ a.getMatricula());
						System.out.println("adicional: "+ aa.adicionalTurno());
					}
					else if(array.get(i) instanceof Tecnico) {
						System.out.println("matrícula: "+ a.getMatricula());
						System.out.println("adicional: "+ at.getSalario());
					}
				}
				break;
			}
		} while(opt != "s");
		
	}

}
