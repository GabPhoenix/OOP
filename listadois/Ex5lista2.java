/*Escreva um programa que leia o nome de X pessoas. Após ler todos os
nomes, pergunte ao usuário o nome que ele deseja consultar e verifique se este nome
consta na lista.
Obs.: O número de pessoas deve ser determinado pelo usuário.*/

package aulas.listadois;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5lista2 {

public static void main(String[] args) {
		int amount = 0, i=0;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList();
		
		// Ask to user
		System.out.println("How many names do you want add to list?");
		amount = sc.nextInt();
		sc.nextLine();
		
		// Ask the names
		for(i=0; i<amount ; i++){
		System.out.println("Inform a name: ");
		names.add(sc.nextLine());
		}
		
		// Cheking names
		String consult;
		System.out.println("Check name:");
		consult = sc.nextLine();
		
		if (names.contains(consult)) {
		System.out.println("The name is in the list");
		}
		
		else {
		System.out.println("The name isn't in the list");
		}

	}

}