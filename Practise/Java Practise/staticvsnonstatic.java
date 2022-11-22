package javaoops;

public class staticvsnonstatic {
	static int sum(int x) {
		return x+x;
	}
	public int sums(int y) {
		return y;
	}
	public static void main(String[] args) {
		System.out.println(sum(2));
		staticvsnonstatic obj = new staticvsnonstatic();
		int val = obj.sums(2);
		System.out.println(val);
	}
}

