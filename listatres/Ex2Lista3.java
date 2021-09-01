/*Escreva um programa que leia 02 números a operação aritmética desejada.
Se o usuário digitar:*/

package aulas.listatres;

import java.util.Scanner;

public class Ex2Lista3 {

	// SUM
	public static double sum(double n1, double n2) {
		return n1 + n2;
	}
	
	// SUB
	public static double sub(double n1, double n2) {
		return n1 - n2;
	}
	
	// MULTPLY
	public static double mtp(double n1, double n2) {
		return n1 * n2;
	}
	
	// DIVIDE
	public static double dvid(double n1, double n2) {
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		// Receiving the first number 
		System.out.println("Inform the first number: ");
		n1 = sc.nextDouble();
		sc.nextLine();
		
		// Receiving the second number 
		System.out.println("Inform the second number: ");
		n2 = sc.nextDouble();
		sc.nextLine();
		
		// Operation
		System.out.println("Which operation you want realize:");
		String operation = sc.nextLine();
		
		switch(operation) {
			case "+":
				System.out.println(sum(n1, n2));
				break;
			case "-":
				System.out.println(sub(n1, n2));
				break;
			case "*":
				System.out.println(mtp(n1, n2));
				break;
			case "/":
				System.out.println(dvid(n1, n2));
				break;
		}
	}

}
