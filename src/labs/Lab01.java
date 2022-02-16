package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int num1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int num2 = inKey.nextInt();
		
		double num1Pow = Math.pow(num1, num2);
		System.out.println(num1 + "^" + num2 + " = " + num1Pow + "\n");
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		double num1 = inKey.nextDouble();
		
		double num2 = Math.sqrt(num1);
		System.out.println("The square root of " + num1 + " is " + num2 +"\n");
		
		
		
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Length of side A: ");
		double num1 = inKey.nextDouble();
		System.out.print("Length of side B: ");
		double num2 = inKey.nextDouble();
		
		double num1Pow = Math.pow(num1, 2);
		double num2Pow = Math.pow(num2, 2);
		double numPow = num1Pow + num2Pow;
		
		double hypot = Math.sqrt(numPow);
		
		System.out.print("Hypotenuse = " + hypot + "\n");
		

	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		
		int zero = -1;
		int max = 0;
		int min = 0;
		
		while (zero != 0) {
			
			System.out.print("Enter an integer: ");
			zero = inKey.nextInt();
			
			max = Math.max(max, zero);
			min = Math.min(min, zero);

			
			
		};
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		
	}
	
	
	
	
	
	
}
