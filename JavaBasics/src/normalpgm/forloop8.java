package normalpgm;

public class forloop8 {
	public static void Factorial()
    {
	
       int fact=1;
       int no=4;
for(int i=1;i<=no;i++)
{ 
	
	fact=fact*i;

	}

   System.out.println("fact of " + no+ " is: "+fact);
}
    public static void main(String[]args)
{
   forloop8.Factorial();
}
}