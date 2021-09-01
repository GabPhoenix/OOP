/*Escreva um programa que inverta uma frase informada pelo usuário e
mostre na tela.*/

package aulas.listadois;

import java.util.Scanner;

public class Ex7Lista2 {

	public static void main(String[] args) {
		String frase = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		frase = sc.nextLine();
		
		System.out.println(new StringBuilder(frase).reverse().toString());

	}

}
