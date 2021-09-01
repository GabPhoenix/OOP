/*Escreva um programa que leia 10 números e armazene em um vetor. Em
seguida, mostre a soma desses números. */

package aulas.listadois;

import java.util.Scanner;

public class Ex1Lista2 {
	public static void main(String[]args) {
		int vetor[] = new int[10];
		int i = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		//receiving the values
		while(i < 10) {
			System.out.println("Inform a value: ");
			vetor[i]= sc.nextInt();
			i++;
		}
		//show the values
		for(i=0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		//calculating the sum
		for(i=0; i < vetor.length; i++) {
			sum+= vetor[i];
		}
		//show the result
		System.out.println("Total: "+ sum);
	}
}
