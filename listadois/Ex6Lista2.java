/*Escreva um programa que leia dois vetores de 05 elementos cada. Após ler
todos os elementos, verifique se os vetores são iguais e mostre na tela.*/

package aulas.listadois;

import java.util.Scanner;

public class Ex6Lista2 {

	public static void main(String[] args) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		int[] vector_one = new int[5];
		int[] vector_two = new int[5];
		
		//first vector
		for(i=0; i < vector_one.length; i++) {
			System.out.println("Inform a number: ");
			vector_one[i]+= sc.nextInt();
			sc.nextLine();
		}
		
		//show first vector
		for(i=0; i < vector_one.length; i++) {
			System.out.println(vector_one[i]);
		}	
		
		//second vector
		for(i=0; i < vector_two.length; i++) {
			System.out.println("Inform a number: ");
			vector_two[i]+= sc.nextInt();
			sc.nextLine();
		}
		
		//show first vector
		for(i=0; i < vector_two.length; i++) {
			System.out.println(vector_two[i]);
		}	
		
		//comparing
		for(i=0; i < vector_two.length; i++) {
			if(vector_one[i] == vector_two[i]) {
				System.out.println("The vectors are equals!");
			}
			else {
				System.out.println("The vectors aren't equals!");
			}
		}
		
	}

}
