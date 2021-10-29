package Methodoverloading;

public class Moverloading2 
{
	public void square()
	{
		System.out.println("no para method called");
	}
public void square(int number)
{
	int square=number*number;
	System.out.println("method with int arg called:"+square);
}

public void square(float number)
{
	float square=number*number;
	System.out.println("method with float arg called:"+square);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Moverloading2 obj=new Moverloading2();
		obj.square(5.5f);
		obj.square();
		obj.square(10);
	}

}
