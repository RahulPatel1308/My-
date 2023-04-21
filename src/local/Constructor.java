package local;

public class Constructor {

	String name;  	
	int age;
	
	public static void main(String[] args) {
		
	Constructor obj	=new Constructor("abc",30);
		
	}
  public Constructor () { //Default constructor

  System.out.println("defualt constructor");
  
  
  }

  public Constructor (String name,int age) {
	  
	  System.out.println(name);
	  System.out.println(age);	
	
  this.name=name;
  
  }
}
  
