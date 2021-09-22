/*Escreva um programa com um método que receba um vetor como
parâmetro e calcule a média dos valores contidos no vetor. Obs.: O tamanho do vetor
deve ser informado pelo usuário.*/

package aulas.listatres;

import java.util.Scanner;

public class Ex7Lista3 {

	public static double average(double[] vetor) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Inform the average: ");
			vetor[i]+=sc.nextDouble();
		}
		
		for(int i=0; i<vetor.length; i++) {
			sum+=vetor[i];
		}
		
		return sum/vetor.length;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("How many averages? ");
		count = sc.nextInt();
		sc.nextLine();
		double[] vetor = new double[count];
		
		System.out.println(average(vetor));
		
		
	}

}
