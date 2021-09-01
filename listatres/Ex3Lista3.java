/*Escreva um programa com um método que receba uma String e retorne o
número de vogais dessa String.*/

package aulas.listatres;

import java.util.Scanner;

// VERIFY THE NUMBER OF VOWELS
public class Ex3Lista3 {
	public static int vowels(String word) {
		int count = 0;
		// verify the number of vowels and to count
		for(int i=0; i<word.length();i++) {
			char c = word.charAt(i);
			if (c == 'a' ||  c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count+=1;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Receiving the String
		System.out.println("Inform a word: ");
		String word = sc.nextLine();
		
		// Return the amount of vowels
		System.out.println(vowels(word));
	}

}
