/*Escreva um programa que leia uma palavra e mostre a quantidade de
vogais da palavra.*/

package aulas.listadois;

import java.util.Scanner;

public class Ex9Lista2 {

	public static void main(String[] args) {
		int count =0;
		String word;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a word: ");
		word = sc.nextLine();
		word.toLowerCase();
		
		for(int i=0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c == 'a' ||  c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count+=1;
			}			
		}
		
		System.out.println(count);
	}

}
