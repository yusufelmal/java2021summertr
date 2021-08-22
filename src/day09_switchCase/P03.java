package day09_switchCase;

import java.util.Scanner;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		 *  formula
		    
		    c = (f-32)*5/9
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("bir sıcaklik derecesini fahrenheit olarak giriniz: ");
		
		double f = scan.nextDouble();
		
		double c = (f*32)*5/9;
		
		System.out.println();

	}

}
