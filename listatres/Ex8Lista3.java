/*Escreva um programa que leia a idade e o nome de 10 pessoas. Escreva
métodos para:
• Retornar o nome da pessoa mais velha;
• Retornar o nome da pessoa mais nova;
• O numero de pessoas com mais de 18 anos*/

package aulas.listatres;

import java.util.Scanner;

public class Ex8Lista3 {
	
	public static String oldest(int[] age, String[] names) {
		int bigger = age[0], index = 0, i = 0;
		for(i=0; i<age.length;i++) {
			if(age[i]>bigger) {
				bigger = age[i];
				index = i;
			}
		}
		return names[index];
		
	}
	
	public static String newble(int[] age, String[] names) {
		int smallest = age[0], index = 0, i = 0;
		for(i=0; i<age.length;i++) {
			if(age[i]<smallest) {
				smallest = age[i];
				index = i;
			}
		}
		return names[index];
	}
	
	public static int legalAge(int[] age) {
		int count = 0, i = 0;
		for(i=0; i<age.length;i++) {
			if(age[i]>=18) {
				count+=1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		int[] age = new int[10];
		
		for(int i = 0; i< names.length; i++) {
			System.out.println("Informe the name: ");
			names[i] += sc.nextLine();
			
			System.out.println("Informe the age: ");
			age[i] += sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println(oldest(age, names));
		System.out.println(newble(age, names));
		System.out.println(legalAge(age));
		

	}

}
