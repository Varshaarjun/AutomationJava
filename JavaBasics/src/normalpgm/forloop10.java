package normalpgm;

public class forloop10 {
	public static void Pallindrome()
    {
	
      String str="nitin";
      String original_str=str;
      String rev="";
      int len=str.length();
      
for(int i=len-1;i>=0;i--)
{ 
	
	rev=rev+str.charAt(i);
}
		if(original_str.equals(rev))
		{
			 System.out.println(original_str+" is pallindrome string");
			 }
		else
		{
			 System.out.println(original_str+" is not pallindrome string");
		 }	
    }
	
    public static void main(String[]args)
   {
   forloop10.Pallindrome();
   }
 }
	
	