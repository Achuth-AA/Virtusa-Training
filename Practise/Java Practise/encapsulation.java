package javaoops;

class FirstClass{
	private String name;
	public String getname() {
		return name;
	}
	public void setname(String newName) {
		this.name= newName;
	}
}


public class encapsulation {
	public static void main(String[] args) {
		FirstClass object = new FirstClass();
		object.setname("Achuth");
		String val = object.getname();
		System.out.println(val);
	}
}

// encapsulation is just hiding the sensitive information from the end users in order to achieve this we just set te getname and setname methods this is call encapuslation 
// to achieve the encapuslation we will keep the variable / attributes as private 

