package javaoops;

public class main1 {
	int x = 10;
	public static void main(String[] args) {
		main1 obj = new main1();
		Second newobj = new Second();
		System.out.println(obj.x);
		System.out.println(newobj.x);
		
		Test newob = new Test();
		newob.name = "Dintakurthi Achuth"; 
		System.out.println(newob.name);
	}
}

class Second{
	int x = 20;
}
class Test{
	String name="Achuth";
}
