package ch01.ProgEx;

public class Exercises {

	public static void main(String[] args) 
	{
		/**if you dont create a new object then the methods have to be static**/
		Exercises ex = new Exercises();	//creating a new object
		ex.p1_1();	//calling the method
		ex.p1_2();
		ex.p1_5();
	}
	
	//prints a greeting in french
	public void p1_1() {
		System.out.println("Bonjour Monsieur");
	}
	
	//returns the sum of the first 10 positive integers
	public void p1_2() {
		int sum = 0;
		for(int i=0; i<=10; i++)
		{
			sum += i;
		}
		System.out.println("Sum of first 10 integers: "+sum);
	}
	
	//prints out name inside a box
	public void p1_5() {
		System.out.println("--------");
		System.out.println("| ABIN |");
		System.out.println("--------");
	}

}
