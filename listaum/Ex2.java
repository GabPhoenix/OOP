/*Escreva um programa que leia a altura de 05 pessoas e calcule a média.*/

package aulas.listaum;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		float average = 0;
		Scanner sc = new Scanner(System.in);
		
		for (float i=0; i<5; i++) {
			System.out.println("Which is your height? ");
			average += sc.nextFloat();
		}
		
		System.out.println("The height average is: "+average/5);
	}

}
