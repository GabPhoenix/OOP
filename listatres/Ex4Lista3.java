/*Escreva um programa com um método que receba o salário de um
funcionário e calcule o imposto que ele deve pagar. Utilize os seguintes valores para
calcular o imposto:
• Até R$ 2.000,00 – Isento de imposto
• De R$ 2.000,01 até R$ 3.500,00 – 15% de imposto
• De R$ 3.500,01 até R$ 5.000,00 – 22% de imposto
• Acima de R$ 5.000,01 – 30% de imposto*/

package aulas.listatres;

import java.util.Scanner;

public class Ex4Lista3 {

	// CALCULATING THE TAX
	public static double taxs(double wage) {
		double tax = 0;
		if(wage <= 2000.00) {
			tax = 0;
		}
		else if(wage > 2000.00 && wage <= 3500.00) {
			tax = wage*=0.15;
		}
		else if(wage > 3500.00 && wage <= 5000.00) {
			tax = wage*=0.22;
		}
		else if(wage > 5000.00) {
			tax = wage*=0.30;
		}
		
		return tax;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//receiving the wage
		System.out.println("Inform your wage: ");
		double wage = sc.nextDouble();
		
		
		System.out.println("The tax is: R$"+ taxs(wage));
		
		
	}

}
