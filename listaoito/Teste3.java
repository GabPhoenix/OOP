package aulas.listaoito;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste3 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String nome;
		ArrayList<Turma> array = new ArrayList<Turma>(); 
		Estudante e = null;
		Turma t = null;
		double[] notas = new double[4];
		int opt, matricula = 0, codigo, quantidade = 0;
		
		do {
			System.out.println("Para cadastrar uma turma, digite 1;");
			System.out.println("Para cadastrar um estudante, digite 2;");
			System.out.println("Para listar turmas, digte 3;");
			System.out.println("Para listar estudantes por turma, digite 4;");
			System.out.println("Para consultar a média de um estudante, digite 5;");
			System.out.println("Para alterar as notas de um estudante, digite 6;");
			System.out.println("Para exibir a média dos estudantes da turma, digite 7;");
			System.out.println("Para sair, digite 0;");
			System.out.println("o que deseja fazer?");
			opt = sc.nextInt();
			sc.nextLine();
			switch(opt){
			case 1:
				if(array.size()<10) {
					System.out.println("Informe o código da turma: ");
					codigo = sc.nextInt();
					sc.nextLine();
					e = new Estudante("", 0, notas);
					array.add(t = new Turma(codigo, e));
					System.out.println("Turma criada com sucesso!");
				}
				else
					System.out.println("O limite turmas excedeu!");
				break;
			case 2:
				System.out.println("Informe a turma que deseja alocar o estudante: ");
				int cod = sc.nextInt();
				sc.nextLine();
				for(int i=0;i<array.size();i++) {
					if(array.get(i).getCodigo()==cod) {
						System.out.println("Informe o nome do estudante: ");
						nome = sc.nextLine();
						for(int j=0; j<notas.length;j++) {
							System.out.println("Informe uma nota do estudante: ");
							notas[j]+=sc.nextDouble();
						}
						
						matricula+=1;
						array.get(i).getEstudante().setNome(nome);
						array.get(i).getEstudante().setMatricula(matricula);
						array.get(i).getEstudante().setNotas(notas);
						quantidade+=1;
					}
				}
				break;
			case 3:
				for(int i=0; i<array.size();i++) {
					System.out.println(array.get(i).getCodigo());
				}
				break;
			case 4:
				System.out.println("Informe o código da turma que deseja verificar: ");
				int verificar = sc.nextInt();
				sc.nextLine();
				for(int i=0; i<array.size();i++) {
					if(array.get(i).getCodigo()==verificar) {
						System.out.println(array.get(i).getEstudante().getNome());
					}
				}
				break;
			case 5:
				System.out.println("Informe o código da turma: ");
				int cod_turma = sc.nextInt();
				sc.nextLine();
				for(int i=0; i<array.size();i++) {
					if(array.get(i).getCodigo()==cod_turma) {
						System.out.println("Informe o número de matrícula do estudante: ");
						int nummt = sc.nextInt();
						sc.nextLine();
						if(array.get(i).getEstudante().getMatricula()==nummt) {
							System.out.println("A média do estudante é: "+ e.media());
							
						}
					}
				}
				break;
			case 6:
				System.out.println("Informe o código da turma: ");
				int c_turma = sc.nextInt();
				sc.nextLine();
				for(int i=0;i<array.size();i++) {
					if(array.get(i).getCodigo()==c_turma) {
						System.out.println("Informe a matrícula do estudante: ");
						int mat = sc.nextInt();
						sc.nextLine();
						for(int j=0;j<array.size();j++) {
							if(array.get(j).getEstudante().getMatricula()==mat) {
								double[] novas_notas = new double[4];
								for(int k=0;i<novas_notas.length;i++) {
									System.out.println("Informe as notas: ");
									novas_notas[i]+=sc.nextDouble();
								}
								t.getEstudante().setNotas(novas_notas);
							}
						}
					}
				}
				break;
			case 7:
				System.out.println("Informe o código da turma: ");
				int cod7 = sc.nextInt();
				sc.nextLine();
				for(int i=0;i<array.size();i++) {
					if(array.get(i).getCodigo()==cod7) {
						System.out.println(t.media_Da_Turma(quantidade));
					}
				}
				break;
			}
				
		}while(opt!=0);

	}

}
