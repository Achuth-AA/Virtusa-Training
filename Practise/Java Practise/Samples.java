package dsa;
import java.util.*;
public class Samples {
	public static void main(String[] args) {
		Scanner takeinp = new Scanner(System.in);
		System.out.println("enter a number");
		int a = takeinp.nextInt();
		System.out.println(a);
		System.out.println("enter a string");
		String name = takeinp.nextLine();
		System.out.println(name);
		System.out.println("Another type");
		double value = takeinp.nextDouble();
		System.out.println(value);
		takeinp.close();
	}

}
