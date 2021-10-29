package constructor;

public class consoverloading1 {
	
	consoverloading1(){
		

		 System.out.println("zero para cons");
		 System.out.println("having no para");
	}
consoverloading1(int a)
{

	 System.out.println("parametrized cons");
	 System.out.println("having int para");
}
consoverloading1(double b)
{

	 System.out.println("parametrized cons");
	 System.out.println("having double para");
}
	
consoverloading1(int a,double b,int c)
{

	 System.out.println("parametrized cons");
	 System.out.println("having int ,double,int para");
}
consoverloading1(double a,int b,int c)
{
	 System.out.println("parametrized cons");
	 System.out.println("having double,int,int para");
}
	public static void main(String args[])
	{
	 consoverloading1 pc1=new  consoverloading1();
	 consoverloading1 pc2=new  consoverloading1(12);
	 consoverloading1 pc3=new  consoverloading1(13.34);
	 consoverloading1 pc4=new  consoverloading1(10,13.34,45);
	 consoverloading1 pc5=new  consoverloading1(13.34,23,87);
}
}
 
	