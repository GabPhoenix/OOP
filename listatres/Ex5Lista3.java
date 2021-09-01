/*Escreva um programa com m�todos para calcular a �rea ( ) e o
per�metro de um ret�ngulo ( ). Forne�a as seguintes op��es ao usu�rio:
1. Calcular a �rea do ret�ngulo
2. Calcular o per�metro do ret�ngulo*/

package aulas.listatres;

import java.util.Scanner;

public class Ex5Lista3 {

	// CALCULATE THE AREA
	public static double area(double width, double height) {
		double area = width*height;
		return area;
	}
	
	// CALCULATE THE PERIMETER
	public static double perimeter(double width, double height) {
		double perimeter = (2*width)+(2*height);
		return perimeter;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Receiving the operation
		System.out.println("You want calculate area or prerimeter of rectangle: ");
		String operation = sc.nextLine();
		
		// Receiving the width
		System.out.println("Inform the width: ");
		double width = sc.nextDouble();
		
		// Receiving the height
		System.out.println("Inform the height: ");
		double height = sc.nextDouble();
		
		
		// Return the values
		switch(operation) {
			case "area":
				System.out.println("The area of rectangle is "+ area(width, height));
				break;
			case "perimeter":
				System.out.println("The perimeter of rectangle is "+ perimeter(width, height));
				break;
		}
		
	}

}
