package proSelf;
import java.util.*;


public abstract class MinimumCal {
	public static Scanner scan=new Scanner(System.in);
	public int weight;
	public int height;
	
	public int enterHeight() {
		System.out.println("Please enter your height(in cantimeters): ");
		height=scan.nextInt();
		return height;
	}
	public int enterWeight() {
		System.out.println("Please enter your weight(in kilograms): ");
		weight=scan.nextInt();
		return weight;
	}
	public abstract double MinCal();
}
