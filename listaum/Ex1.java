/*Escreva um programa que calcule a idade do usuário. Para isso, o
programa deve ler o ano de nascimento, o ano atual e depois mostrar a idade.
Obs.: O ano deve ser informado no formato AAAA (ex.: 1980).*/

package aulas.listaum;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int currentYear;
		int birthYear;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		//receiving the current year
		System.out.println("Inform the current year: ");
		currentYear = sc.nextInt();
		
		//receiving the birth year
		System.out.println("Inform the birth year: ");
		birthYear = sc.nextInt();
		
		//age
		age = currentYear - birthYear;
		System.out.println("Your age is: "+ age);
	
	}

}
