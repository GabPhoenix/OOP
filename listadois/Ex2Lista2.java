/*Escreva um programa que leia 10 números e mostre as seguintes
informações:
a) Menor valor digitado
b) Maior valor digitado
c) Média dos valores digitados*/

package aulas.listadois;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2Lista2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int i=0;
		int sum=0;
		int media=0;
		
		//receiving the values
		while(i < 10) {
			System.out.println("Inform a value: ");
			array[i]= sc.nextInt();
			i++;
		}
		
		//put in order
		Arrays.sort(array);
		int lower = array[0];
		int highest = array[9];
		
		//calculating the media
		for(i=0; i < array.length; i++) {
			sum+= array[i];
			media = sum/10;
		}
		
		//show the values
		System.out.println("Highest value: "+ highest);
		System.out.println("lower value: "+ lower);
		System.out.println("average: "+ media);
	}
}
