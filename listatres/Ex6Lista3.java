/*Escreva um programa com métodos que façam a conversão de Fahrenheit
para Celsius ( – ) e de Kelvin para Celsius ( )). Forneça as
seguintes opções ao usuário:
1. Transformar de Fahrenheit para Celsius
2. Transformar de Kelvin para Celsius*/

package aulas.listatres;

import java.util.Scanner;

public class Ex6Lista3 {

	// FAHRENHEIT TO CELCIUS
	public static double fahrenheit_To_Celcius(double value) {
		double c = (value -32)/1.8;
		return c;
				
	}
	
	// KELVIN TO CELCIUS
	public static double kelvin_To_Celcius(double value) {
		double c = value - 273.15;
		return c;
				
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Receiving the operation
		System.out.println("Choose if you want convert Fahrenheit to Celcius 'ftoc'"
				+ " or Kelvin to Celcius 'ktoc' ");
		String operation = sc.nextLine();
		
		// Receiving the value
		System.out.println("Inform the value: ");
		double value = sc.nextDouble();
		
		// Return the result
		switch(operation) {
			case "ftoc":
				System.out.println(value+"° Fahrenheit to Celcius is "+fahrenheit_To_Celcius(value)+"°");
				break;
			case "ktoc":
				System.out.println(value+"Kelvin to Celcius is "+kelvin_To_Celcius(value)+"°");
		}
		

	}

}
