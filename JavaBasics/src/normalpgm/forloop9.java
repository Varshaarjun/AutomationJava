package normalpgm;

public class forloop9 {
	public static void Prime()
    {
	
       int sum=0;
       int no=18;
for(int i=2;i<=no-1;i++)
{ 
	
	if(no%i==0)
		{
		sum=sum+1;
		}

	}
	if(sum==0)
	{
   System.out.println(no+ " is a prime no");
	}
	else
	{
		   System.out.println(no+ " is not  a prime no");
			}
    }
    public static void main(String[]args)
   {
   forloop9.Prime();
   }
 }
	