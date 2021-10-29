package method0;

public class Method05 {

	 double x=40,y=60,z=50;
	   
		public static void main(String[] args)
		{
			Method05 m1=new Method05();
			
	System.out.println("input the 1st no :"+m1.x);
	System.out.println("input the 2nd no :"+m1.y);
	System.out.println("input the 3rd no  :"+m1.z);
	  m1.average(m1.x,m1.y,m1.z);
		}
		public void average(double p,double q,double r)
		{
			double res=(p+q+r)/3;
			System.out.println("the average value is "+res);

		}

	}
