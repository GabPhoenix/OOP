/*Leia o peso e a altura de 05 pessoas e calcule o IMC e armazene em um
vetor. Após o termino do programa, imprima as seguintes informações:
 O Número de pessoas que estão abaixo do peso (IMC < 18,5);
 O Número de pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC < 25);
 O Número de pessoas que estão acima do peso (IMC > = 25)*/

package aulas.listaum;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int lower = 0, ideal = 0, highest = 0;
		double weight, height; 
		double imc[] = new double[5];

		Scanner sc = new Scanner(System.in);

		for (int i=0; i < imc.length; i++) {
			//receiving the weight
			System.out.println("Inform your weight: ");
			weight = sc.nextDouble();

			//receiving the height
			System.out.println("Inform your height: ");
			height = sc.nextDouble();

			//IMC
			imc[i]= weight/(height*height);
			
			//lower
			if (imc[i]< 18.5) {
				lower++;
			}
			//ideal
			else if (imc[i]> 18.5 && imc[i] < 25.0) {
				ideal++;
			}
			//highest
			else if (imc[i]>= 25.0) {
				highest++;
			}
		
		//show the info
		System.out.println(imc[i]);
		System.out.println("People lower weight"+ lower);
		System.out.println("People ideal weight"+ ideal);
		System.out.println("People highest weight"+ highest);

		}

	}

}
