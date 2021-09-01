/*Escreva um programa que leia dois números e a operação aritmética
desejada.
Se o usuário digita ‘+’, retorne o resultado da soma entre os números;
Se o usuário digita ‘-’, retorne o resultado da subtração entre os números;
Se o usuário digita ‘*’, retorne o resultado da multiplicação entre os números;
Se o usuário digita ‘/’, retorne o resultado da divisão entre os números;*/

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
