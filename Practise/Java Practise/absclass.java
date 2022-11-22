package javaoops;

abstract class MainClass{
	int x;
	public abstract int method(int x);
	public MainClass() {
		this.x = 20;
	}
}

class Subclass extends MainClass {
	public Subclass() {
		super();
	}
	public int method(int x) {
		//System.out.println("checking");
		return x;
	}
}

public class absclass {
	public static void main(String[] args) {
		Subclass obj = new Subclass();
		System.out.println(obj.x);
		System.out.println(obj.method(2));
	}
}
