package method0;

public class Method04 {
   static double x=10,y=20,z=30;
   
	public static void main(String[] args)
	{
System.out.println("input the 1st no :"+x);
System.out.println("input the 2nd no :"+y);
System.out.println("input the 3rd no  :"+z);
  average(x,y,z);
	}
	public static void average(double p,double q,double r)
	{
		double res=(p+q+r)/3;
		System.out.println("the average value is "+res);

	}

}
