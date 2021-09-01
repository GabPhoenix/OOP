/*Escreva um programa que conte o número de letras de uma frase
informada pelo usuário.*/

package aulas.listadois;

import java.util.Scanner;

public class Ex8Lista2 {

	public static void main(String[] args) {
		String phrase;
		String result;
		Scanner sc = new Scanner(System.in);

		//receiving the phrase
		System.out.println("Inform: ");
		phrase= sc.nextLine();
		
		//replace all spaces " " to nothing ""
		result = phrase.replaceAll(" ", "");
		
		//show the result
		System.out.println(result.length());
		
	}

}
