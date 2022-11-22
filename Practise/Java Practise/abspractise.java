package javaoops;
import java.util.*;

abstract class MainsClss{
	int x;
	public MainsClss(int y) {
		this.x = y;
	}
}

class SubsClass extends MainsClss{
	public SubsClass(int y) {
		super(y);
	}
	String val = "something";
}

public class abspractise {
	public static void main(String[] args) {
		SubsClass obj = new SubsClass(2014);
		System.out.println(obj.x);
	}
}


// with in the same package we are not supposed to create the same methods 

