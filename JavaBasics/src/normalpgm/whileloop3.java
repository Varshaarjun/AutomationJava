package normalpgm;

public class whileloop3 {

	
	public static void Prime()
    {
	
       int sum=0;
       int no=11;
       int i=2;
while(i<=no)
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
   whileloop3.Prime();
   }
 }
	
	