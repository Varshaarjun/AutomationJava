package normalpgm;

public class whileloop2 {
	public static void Count()
	{
		 int no=1234567891;
		int count=0;
		while(no>0)
		{
			no=no/10;
			count++;
			
		}
		System.out.println(" number of digits:" +count);
		
	}


public static void main(String[] args)
{
	whileloop2.Count();
}
}
	
