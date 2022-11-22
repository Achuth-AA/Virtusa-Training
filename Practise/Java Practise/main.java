package javaoops;
import java.util.*;

public class main {
	public static void main(String[] args) {
//		int[][] arr = new int[3][3];
//		Scanner inp = new Scanner(System.in);
//		for(int i=0;i<arr.length;++i) {
//			for(int j=0;j<arr[i].length;++j) {
//				arr[i][j] = inp.nextInt();
//			}
//		}
//		for(int i=0;i<arr.length;++i) {
//			for(int j=0;j<arr[i].length;++j) {
//				System.out.println(arr[i][j]+1);
//			}
//		}
		System.out.println(fact(5));
	}
	static int sum(int x) {
		return x+x;
	}
	static int fact(int k) {
		if(k>0) {
			return k*fact(k-1);
		} else {
			return 1;
		}
	}
}
