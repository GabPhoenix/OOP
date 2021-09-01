/*Escreva um programa que leia 10 números e mostre na tela números na
ordem inversa.*/

package aulas.listadois;

import java.util.Scanner;

public class Ex4Lista2 {

	public static void main(String[] args) {
		int i=0;
		int vetor[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		//receiving the values
		while(i < vetor.length) {
			System.out.println("Inform a number: ");
			vetor[i]+= sc.nextInt();
			i++;
		}
		//show in inverse order
		for (i = vetor.length -1; i>=0; i--) {
			System.out.println(vetor[i]);
		}
	}
}
