package constructor;

public class consoverloading2 {
  static int age;
  double salary;
  
	consoverloading2(){
		

		 System.out.println("zero para cons");
		 System.out.println("having no para");
	}
consoverloading2(int a)
{

	 System.out.println("int parametrized cons");
	 System.out.println("having int para");
	 age=a;
}
consoverloading2(double b)
{

	 System.out.println("parametrized cons");
	 System.out.println("having double para");
	 salary=b;
}
	
consoverloading2(int a,double b)
{

	 System.out.println("parametrized cons");
	 System.out.println("having int ,double para");
	 age=a;
	 salary=b;
}

	public static void main(String args[])
	{
	 consoverloading2 pc1=new  consoverloading2();
	 System.out.println("after zero para cons,age="+pc1.age);
	 System.out.println("after zero para cons,salary="+pc1.salary);
	 
	 consoverloading2 pc2=new  consoverloading2(33);
	 System.out.println("after int para cons,age="+pc2.age);
	 System.out.println("after int  para cons,salary="+pc2.salary);
	 
	 consoverloading2 pc3=new  consoverloading2(13000.34);
	 System.out.println("after double para cons,age="+pc3.age);
	 System.out.println("after double  para cons,salary="+pc3.salary);
	 
	 consoverloading2 pc4=new  consoverloading2(30,95000.34);
	 System.out.println("after int-double para cons,age="+pc4.age);
	 System.out.println("after int-double para cons,salary="+pc4.salary);
	
}
}

	
	