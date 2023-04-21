package local;

public class Object {
   int age; // global variable
   String name;
   String gender;
    
    public static void main(String[] args) {
		int a;// local variable
		
		new Object();
		new Object();
		new Object();
		
		//if you want to access or give values to created memory we can do it with follwing syntax//
		// classname referencename=new classname();//

		Object obj=new Object();
		obj.age=26;
		obj.gender="Male";
		obj.name="Rahul";
		System.out.println(obj);
		
		Object obj1=new Object();
		obj1.age=30;
		obj1.gender="Female";
		obj1.name="Helen";
		
		

	}

}
