package Methodoverloading;

public class Moverloading7 {

	
	public double myMethod(int num1,int num2)
	{
		System.out.println("1st my method of class demo");
		return num1+num2;
	}

	public int myMethod(int var1, int var2,int var3)
	{
		System.out.println("2nd my method of class demo");
		return var1-var2-var3;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Moverloading7 obj2=new Moverloading7();
		obj2.myMethod(10, 10);
		obj2.myMethod(20,12,15);
	}

}

	