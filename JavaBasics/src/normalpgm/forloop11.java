package normalpgm;

public class forloop11 {
	
	public static void Count()
	{
		 int no=1234567891;
		int count=1;
		for(int i=1;i<=no;i++)
		{
			no=no/10;
			count++;
			
		}
		System.out.println(" number of digits:" +count);
		
	}


public static void main(String[] args)
{
	forloop11.Count();
}
}