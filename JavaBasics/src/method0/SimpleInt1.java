package method0;

public class SimpleInt1 {
	
	public static void SimpleInterest(float principal,float roi,float time)
	{ 
		
		float interest=(principal*roi*time)/100;
		System.out.println("enter the principal"+principal);
		System.out.println("enter the roi"+roi);
		System.out.println("enter the time"+time);
		System.out.println("interest="+interest);
	}

	public static void main(String[] args) 
	{
		SimpleInt1.SimpleInterest(2000, 6, 3);

	}

}
