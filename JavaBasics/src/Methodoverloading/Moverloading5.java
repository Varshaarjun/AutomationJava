package Methodoverloading;

public class Moverloading5 
{
	void disp(int a,double b)
	{
		System.out.println("method A");
	}
	
	void disp(int a,double b,double c)
	{
		System.out.println("method B");
	}
	
	void disp(int a,float b)
	{
		System.out.println("method C");
	}

	
	public static void main(String[] args) 
	{
		Moverloading5 obj=new Moverloading5();
		obj.disp(100, 20.67f);

	}

}
