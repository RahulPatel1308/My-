package local;

public class Method {
static int a=10;
	public static void main(String[] args) {

		Method obj=new Method();
		obj.details();
		System.out.println(obj.marks());
		System.out.println(obj.sum(2,3));
			
		//Static method of direct calling 
		marks();
		//by using classname
		Method.marks();
		System.out.println(Method.a);
	}	
	         //method without return type
			//access modifier return type Name of method() {   }//
			//void means no return values from it//
	
	public void details () {
		
		System.out.println("employee details");
		
	}
	  //method with return type
	//access modifier return type Name of method() {   }//
	
	public static int marks () {
		
		int a=100;
		return a;
	}
	
	// with return type and parameteres // sum(2,3)
	public int sum (int a,int b){
	 int result =a+b;
	 return result;
	}
		
	}

