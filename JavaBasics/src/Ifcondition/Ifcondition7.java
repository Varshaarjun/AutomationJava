package Ifcondition;

public class Ifcondition7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int marks=75;
         
         if(marks<50)
            {
	          System.out.println("fail");
            }
         else if(marks>=50 &&  marks<60)
         {
        	 System.out.println("  grade D");
         }
             else if(marks>=60 &&  marks<70)
               {
        	 System.out.println("  grade c");
               }
              else if(marks>=70 &&  marks<80)
                     {
        	         System.out.println("  grade B");
                    }
                  else if(marks>=80 &&  marks<90)
         {
        	 System.out.println("  grade A");
         }
                  else if(marks>=90 &&  marks<100)
                  {
                 	 System.out.println("  grade A+");
                  }
                  else
                  {
                	  System.out.println("  invalid");  
                  }
	}

}
