package local;

public class Childclass {

	public static void main(String[] args) {
		
		//Calling method from method.java
		//first we need to create object 
		
	Method obj=	new Method();
	obj.sum(6,5);
	
	//how to call static method in different class
	//write name of class
	Method.marks();

		
	}

}
