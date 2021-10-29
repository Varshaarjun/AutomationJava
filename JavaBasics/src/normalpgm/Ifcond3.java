package normalpgm;

public class Ifcond3 
{
	public static void leap()
	{
		int year=2000;
     if(((year % 4 ==0)&&(year % 100 !=0)) || (year % 400 ==0))
         {
	         System.out.println(" is a leap year");
        }
      else
        {
	            System.out.println("is not leap year or is a common year");
         }
	    }
	
		
		public static void main(String[] args) {
			Ifcond3.leap();

	       
		}

	}


