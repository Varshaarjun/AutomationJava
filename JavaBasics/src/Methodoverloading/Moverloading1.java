package Methodoverloading;

public class Moverloading1 
{
  static double res;
  static public void square()
  {
	  System.out.println("No parameter method called: ");
  }
  static public void square(int number)
  {
	  res=number*number;
  
  System.out.println("Method with int argument called: "+res);
}
  static public void square(double number)
  {
	  res=number*number;
	  System.out.println("Method with float argument called: "+res);
  }
	public static void main(String[] args) 
	{
		Moverloading1.square(2.5f);
		Moverloading1.square();
		Moverloading1.square(5);
	

	}

}
 