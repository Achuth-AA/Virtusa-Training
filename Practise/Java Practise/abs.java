package javaoops;
import java.util.*;
// we cannot create methods with abstract class so we are supposed to create methods with the inherited class
abstract class Student{
	String name = "Achuth";
	int reg = 4066;
	public abstract int method1(int x); // and the abstract methods dont have any body that body will be in the inherited class
} // with in the abstract class itself only we are supposed to create the abstract methods 

class Data extends Student{
	public int method1(int x) {
		return x;
	}
	String year = "fourth";
}

public class abs {
	public static void main(String[] args) {
		Data obj = new Data();
		System.out.println(obj.name);
		System.out.println(obj.reg);
		System.out.println(obj.method1(21));
		System.out.println(obj.year);
	}
}
