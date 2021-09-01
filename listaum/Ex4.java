/*Escreva um programa que leia a idade de várias pessoas e calcule a média.
O programa deve ler as idades até o usuário digitar 0 (zero).*/

package aulas.listaum;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int ages;
		int average;
		int sum = 0;
		int count = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Inform your age: ");
			ages = sc.nextInt();
	
			if (ages > 0) {
				sum += ages;
				count += 1;
			}	
		} while (ages != 0);
		
		if (count > 0) {
			average = (sum/count);
			System.out.println(average);
		}
	}
}

