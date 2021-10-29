package normalpgm;

public class Ifcond4 {
	

	public static void consonentvowel()
	{
		char ch='z';
     if(ch=='a' || ch=='e'  || ch=='i' || ch=='o' || ch=='u')
         {
	         System.out.println(" is a vowel");
        }
      else
        {
	            System.out.println("is a consonent");
         }	  
     }
	
		
		public static void main(String[] args) 
		{
			Ifcond4.consonentvowel();
		}
}