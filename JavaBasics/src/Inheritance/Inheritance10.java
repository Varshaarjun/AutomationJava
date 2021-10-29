package Inheritance;

//parent class
// Company {
	//global variable
	//method with method overloading use of this keyword
	//constructor with overloading and use of this()
//}
//child class of Company
//class Employee extends Company {
	//global variable name as Company name variable
		//method with method overloading use of this & super keyword
		//constructor with overloading and use of this() & super()
//}


class Company {
	int id;
          Company(){
	       System.out.println("zero para mcon of class company");
	   
            }
          
	       Company(int id ) {
	    	   this();
	    	   System.out.println("para cons of class company");
	    	   System.out.println("value of local id:"+id);
	    	   System.out.println("intial val of golbal id is"+this.id);
		     this.id= id;
	   }
	void display()
	{
		System.out.println("display emp info");
		}
	void display(int rollno)
{
		System.out.println("companyEmp has " + "rollno also");
		}
}
class Employee extends Company {
	   float salary;
	   Employee()
	   {
		   this(10,20000f);
	   }
	   Employee(int id, float salary) {
	   
		super(id);   //super keyword is used to call parent class's variable and method
         
		
		System.out.println("initial val of sal is:"+this.salary);
		System.out.println("val of local sal is:"+salary);
	this.salary = salary;
	System.out.println("final val of global sal is:"+this.salary);
	   }
	void display(int id) {
	  super.display(10);
		System.out.println("id:"+id);
	    System.out.println("salary:"+ salary);
	}
	void display(float salary) {
		  this.display(10);
			System.out.println("salry:"+salary);
}
}
class Inheritance10 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.display(20000.00f);
		
	}
}