/*Escreva um programa com um m�todo que receba um vetor como
par�metro e calcule a m�dia dos valores contidos no vetor. Obs.: O tamanho do vetor
deve ser informado pelo usu�rio.*/

package aulas.listatres;

import java.util.Scanner;

public class Ex7Lista3 {

	public static int average(int valor, int media) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n:");
		valor = sc.nextInt();
		sc.nextLine();
		
		int[] medias = new int[valor];
		
		for(int i=0; i<medias.length; i++) {
			System.out.println("Media: ");
			medias[i] = sc.nextInt();
			sc.nextLine();
		}
		
		for(int i=0; i<medias.length; i++) {
			System.out.println(medias[i]);
		}
		
		return 
	}
	
	public static void main(String[] args) {
		
		int valor;
		System.out.println("n:");
		valor = sc.nextInt();
		sc.nextLine();
		
		int[] medias = new int[valor];
		
		for(int i=0; i<medias.length; i++) {
			System.out.println("Media: ");
			medias[i] = sc.nextInt();
			sc.nextLine();
		}
		
		for(int i=0; i<medias.length; i++) {
			System.out.println(medias[i]);
		}
	}

}
