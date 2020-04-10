package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("*** Costumer preference on type of fuel ***");
		System.out.println();
		boolean control = false;
		int gas = 0, alcool = 0, diesel = 0;
		
		System.out.printf("1\tGas\n2\tAlcool\n3\tDiesel\n4\tFinish poll\n\n");
		System.out.println("Enter the preferred type of fuel, according to the table above: ");
		
		while (control == false) {
			int fuelType = scanner.nextInt();
			switch (fuelType) {
			case 1:
				gas++;
				break;
			case 2:
				alcool++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				control = true;
				break;
			}
		}
		
		System.out.println();
		System.out.printf("Thank you!\n\tGas: %d\n\tAlcool: %d\n\tDiesel: %d", gas, alcool, diesel);
		
		scanner.close();

	}

}
