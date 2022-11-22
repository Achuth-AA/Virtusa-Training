package dsa;
import java.util.*;

public class patterns {
	public static void main(String[] args){
		pattren1(9);
	}
	
	static void pattren1(int n) {
		int temp = n;
		int temp1=0;
		int a=n;
		int var2=1;
		for(int i=1;i<=temp;i++) {
			for(int k=1;k<=((2*a)-2);k++) {
				System.out.print("   ");
			}
			a--;
			for(int j=1;j<=(i+(3*temp1));j++) {
				if(Math.abs(j-var2) <= 9) {System.out.print(Math.abs(j-var2)+ "  " );}
				else {System.out.print( Math.abs(j-var2) + " ");}
			}
			var2 = var2+2;
			temp1++;
			System.out.println();
		}
	}
	static void pattern2() {
		
	}
}
