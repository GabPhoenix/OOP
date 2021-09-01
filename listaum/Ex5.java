/*Escreva um programa que leia dois n�meros e a opera��o aritm�tica
desejada.
Se o usu�rio digita �+�, retorne o resultado da soma entre os n�meros;
Se o usu�rio digita �-�, retorne o resultado da subtra��o entre os n�meros;
Se o usu�rio digita �*�, retorne o resultado da multiplica��o entre os n�meros;
Se o usu�rio digita �/�, retorne o resultado da divis�o entre os n�meros;*/

package aulas.listaum;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int n1;
		int n2;
		String operation;
		int result;
		Scanner sc = new Scanner(System.in);
		
		//first number
		System.out.println("Inform the first number: ");
		n1 = sc.nextInt();
		sc.nextLine();
		
		//second number
		System.out.println("Inform the second number: ");
		n2 = sc.nextInt();
		sc.nextLine();
		
		//operation
		System.out.println("Choose the operation: ");
		operation = sc.nextLine();
		switch (operation) {
			case "+":
				result = n1 + n2;
				System.out.println(result);
				break;
			case "-":
				result = n1 - n2;
				System.out.println(result);
				break;
			case "*":
				result = n1 * n2;
				System.out.println(result);
				break;
			case "/":
				result = n1 / n2;
				System.out.println(result);
				break;
		}
	}
}
