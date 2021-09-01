/*Leia as notas de 10 alunos e armazene em um vetor. Calcule a media das
notas informadas e mostre quantos alunos ficaram acima da média.*/

package aulas.listadois;

import java.util.Scanner;

public class Ex3Lista2 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int i=0, sum=0, media=0, bellow=0, above=0;
		int vetor[] = new int[10];
		
		
		//receiving the values
		while(i < vetor.length) {
			System.out.println("Inform a value: ");
			vetor[i] = sc.nextInt();
			i++;
		}
		//bellow or above 
		for (i=0; i < vetor.length; i++) {
			if (vetor[i]<7) {
				bellow+=1;
			}
			else {
				above+=1;
			}
				
		}
		
		//calculating the media
		for (i=0; i < vetor.length; i++) {
			sum+=vetor[i];
			media = sum/10;
		}
		//show students above and bellow
		System.out.println("Students above: "+ above);
		System.out.println("Students bellow: "+ bellow);
		
		//show the average
		System.out.println("Geral average: "+ media);
	}

}
