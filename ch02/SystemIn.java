package ch02;

import java.util.Scanner;

public class SystemIn {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the unit price: ");
		double unitPrice = in.nextDouble();
		System.out.println("Unit Price: "+unitPrice);
	}

}
