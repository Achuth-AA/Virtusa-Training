package dsa;

public class Practice {
	public static void main(String[] args) {
		// difference between the static and public methods while call the static methods there is no need to create an separate instance for it 
		// which means no need to create an separate object for it in that case we use static methods for the maun fynction 
		int n= 20;
		if(n%2==0) {
			System.out.println("Even number");
		} else if(n==1) {
			System.out.println("odd");
		} else {
			System.out.println("odd number");
		}
		
		// Ternary
		 String a;
		 
		 a = n%2 == 0 ? "Even" : "Odd" ;
		 
		 System.out.println(a);
		 
		 switch(n){
		 case(1):
			 System.out.println("One");break;
		 case(2):
			 System.out.println("Two");break;
			default:
				System.out.println("Limit out of the range");
		 }
		 
		 // iterations 
		 
		 // while loop
		 
		 int a1 = 10;
		 
		 while (a1 > -20) {
			 System.out.println(a1);
			 a1--;
		 }
		 
		 System.out.println("using te do while method");
		 int a11= 21;
		 do {
			 System.out.println(a11);
			 a11--;
		 }while(a11 > 21);
		 
		 
		 System.out.println("Using the for loop");
		 for(int i=0;i<500;i++) {
			 if(i%2==0) {System.out.println(i + " is a even number");}
			 else {System.out.println(i + " is a odd number");}
		 }
		 
		 System.out.println("usinf the strings");	
		 String name = greet();
		 System.out.println(name);
		 greet2("Achuth dintakurti");
	}
	static String greet() {
		String name = "Achuth is a Developer";
		return name;
	}
	static void greet2(String name) {
		System.out.println(name + " is a developer.");
	}
}
