/*Escreva um programa com um m�todo que receba um n�mero e determine
se esse n�mero � par ou �mpar.*/

package aulas.listatres;

import java.util.Scanner;

public class Ex1Lista3 {

	// EVEN OR ODD
	public static boolean verify(int number) {
		if (number%2 == 0) {
		return true;
		}
		else {
		return false;
		}
	}
		
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//receiving the number
		System.out.println("Inform the number:");
		int num = sc.nextInt();
		sc.nextLine();
		
		//calling verification
		if (verify(num) == true) {
		System.out.println("Even!");
		}
		else {
		System.out.println("Odd!");
		}
	}

}