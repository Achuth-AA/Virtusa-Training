package dsa;

import java.util.*;

public class programs {
	public static void main(String[] args) {
//		evenandodd();
//		armstrong();
//		swap();
//		System.out.println((double)sqrt_num(2));
//		System.out.println(factorial(10));
		fact();
	}
	static void evenandodd() {
		int min,max;
		Scanner takeinp = new Scanner(System.in);
		System.out.println("Enter Minimun Range");
		min = takeinp.nextInt();
		System.out.println("Enter Maximum Range");
		max = takeinp.nextInt();
		for(int i=min;i<=max;i++) {if(i%2==0) {System.out.println(i+" is a even number");}else {System.out.println(i+" is a odd number");}}
		takeinp.close();
	}
	static void armstrong() {
		int min,max;
		Scanner takeinp = new Scanner(System.in);
		System.out.println("Enter Minimun Range");
		min = takeinp.nextInt();
		System.out.println("Enter Maximum Range");
		max = takeinp.nextInt();
		for(int i=min;i<=max;i++) {
			int sum = 0;
			int num = i;
			while(num > 0) {int digits = num%10;sum = sum + (digits*digits*digits);num =(num/10);}
			if (sum == i) {System.out.println(i+" is a armstrong number");}
		}
		takeinp.close();
	}
	static void fabinocci() {
//		int a = 0;
//		int b = 1;
//		for(int i=0;i<100;i++) {
//			
//		}
		
	}
	static void num_palindrome() {
		
	}
	static void prime() {
		
	}
	static void str_palindrome() {
		
	}
	static void swap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 'a' value to swap : ");int a = in.nextInt();
		System.out.println("Enter 'b' value : ");int b = in.nextInt();
		int temp = b;
		b = a;
		a = temp;
		System.out.println("a is : "+ a);
		System.out.println("b is : "+ b);
		in.close();
	}
	static void perfectnum() {
		
	} 
	static double sqrt_num(int num) {
		double temp;
		double sqrt = num/2;
		do {
			temp=sqrt;
			sqrt=(temp+(num/temp))/2;
		}while((temp-sqrt)!=0);
		
		return sqrt;
	}
	static long factorial(int num) {
		if(num==0) {return 1;}
		else {return ((num)*factorial(num-1));}
	}
	static void fact() {
		System.out.println("Enter a number");
		Scanner in =new Scanner(System.in);
		int num= in.nextInt();
		int fact = 1;
		if(num==0) {System.out.println(1);}
		else {
			for(int i=num;i>0;i--) {
				fact = fact*i;
			}
		}
		System.out.println(fact);
		in.close();
	}
}
