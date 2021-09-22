package aulas.listaquatro;

import java.util.Scanner;

public class Ex3Lista4 {
	public static String[] imcAbaixo(int qt, String[] nome, double[] peso, double[] altura) {
		int count = 0;	
		String[]  nomesIMC = new String[qt];
		for(int i=0; i<qt; i++) {
			if(peso[i]/(altura[i]*altura[i]) < 18.5) {
				nomesIMC[count]+=nome[i];
				count++;
			}
		}
		return nomesIMC;
	}
	public static String[] imcIdeal(int qt, String[] nome, double[] peso, double[] altura) {
		int count = 0;	
		String[]  nomesIMC = new String[qt];
		for(int i=0; i<qt; i++) {
			if(peso[i]/(altura[i]*altura[i]) > 18.5 && peso[i]/(altura[i]*altura[i]) < 25) {
				nomesIMC[count]+=nome[i];
				count++;
			}
		}
		return nomesIMC;
	}
	public static String[] imcAcima(int qt, String[] nome, double[] peso, double[] altura) {
		int count = 0;	
		String[]  nomesIMC = new String[qt];
		for(int i=0; i<qt; i++) {
			if(peso[i]/(altura[i]*altura[i]) > 25) {
				nomesIMC[count]+=nome[i];
				count++;
			}
		}
		return nomesIMC;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas deseja cadastrar? ");
		int qt = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[qt];
		double[] peso = new double[qt];
		double[] altura = new double[qt];
		
		for(int i=0; i<qt; i++) {
			System.out.println("Informe o nome da pessoa: ");
			nome[i]+= sc.next();
			
			System.out.println("Informe o peso:");
			peso[i]+= sc.nextDouble();
			
			System.out.println("Informe a altura: ");
			altura[i]+= sc.nextDouble();
		}
		
		String abaixo[] = imcAbaixo(qt, nome, peso, altura);
		String ideal[] = imcIdeal(qt, nome, peso, altura);
		String acima[] = imcAcima(qt, nome, peso, altura);
		
		for(int i=0;i<abaixo.length;i++) {
			if(abaixo[i] != null) {
				System.out.println(abaixo[i]);
			}
		}
	
		for(int i=0;i<ideal.length;i++) {
			if(ideal[i] != "nullnullnull") {
				System.out.println(ideal[i]);
			}
		}
		
		for(int i=0;i<acima.length;i++) {
			if(acima[i] != null) {
				System.out.println(acima[i]);
			}
		}
	}

}
