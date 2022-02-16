package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		int time = 0;
		double xpos = 0;
		double ypos = 0;
		
		
		System.out.print("Enter launch velocity (m/s) >>> ");
		double vel = inKey.nextDouble();
		System.out.print("Enter launch angle (degrees) >>> ");
		double angle = inKey.nextDouble();
		
		
		
		System.out.println("\nProjectile's path: \n");
		System.out.println("Time: 0s\n" + "    x-pos: 0.0m\n" + "    y-pos: 0.0m");
		
		while (ypos >= 0) {
			
			
			time++;
			xpos = Math.cos(Math.toRadians(angle)) * time * vel;
			ypos = Math.sin(Math.toRadians(angle)) * time * vel - 0.5 * 9.8 * Math.pow(time, 2);

			
			if (ypos >= 0) {
			System.out.println("Time: " + time + "s\n    x-pos: " + xpos + "m\n    y-pos: " + ypos + "m");
			}
			else {
				System.out.println("Time: " + time + "s\n    x-pos: " + xpos + "m\n    y-pos: 0.0m");
			}
			
			
			
			
		}
		
		
		
		
	}
	
	
}
