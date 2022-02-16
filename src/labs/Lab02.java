package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		
		int countdown = 10;
		
		System.out.print("Enter a positive integer: ");
		int num1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int num2 = inKey.nextInt();
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		int scope = max - min + 1;
		
		
		
		while (countdown != 0) {
			int ten = (int) (Math.random() * scope + min);
			System.out.print(ten + " ");
			
			countdown--;
			
		};
		System.out.println("\n");
		
		
		
		
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		int radius = inKey.nextInt();
		System.out.print("Enter the height: ");
		int height = inKey.nextInt();
		double area = radius * radius * Math.PI;
		
		
		double volume = area * height;
		
		System.out.println(volume);
		
		
		System.out.println("\n");
	}
	

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		double x1 = inKey.nextDouble();
		System.out.println("Enter y1: ");
		double y1 = inKey.nextDouble();
		
		System.out.println("Enter x2: ");
		double x2 = inKey.nextDouble();
		System.out.println("Enter y2: ");
		double y2 = inKey.nextDouble();
		
		double x = Math.abs(x1 - x2);
		double y = Math.abs(y1 - y2);
		
		
		double chalf = Math.pow(x, 2) + Math.pow(y, 2);
		
		double c = Math.sqrt(chalf);
		
		System.out.println("Distance between points = " + c);
		

		
		System.out.println("\n");
	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Enter A-value: ");
		double a = inKey.nextDouble();
		System.out.println("Enter b-value: ");
		double b = inKey.nextDouble();
		System.out.println("Enter c-value: ");
		double c = inKey.nextDouble();
		
		
		double newA = a * 2;
		
		double b1 = b - b - b;
		double b2 = Math.pow(b, 2);
		
		double ac = 4 * a * c;
		
		double square = Math.sqrt(b2 - ac);
		
		double x1 = (b1 - square) / newA;
		double x2 = (b1 + square) / newA;
		
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
	}
	
	

	
}
