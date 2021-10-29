package normalpgm;

public class forloop7 {

	public static void NaturalNo()
	    {
		
	       int no=15,i,total=0;
	System.out.println("enter the value of n:"+no);
	
    for(i=1;i<=no;i++)
    {
    	total=total+i;
    }
    System.out.println("sum of first " + no + " natural no is  :"+total);
	}


   public static void main(String[] args)
   {
	forloop7.NaturalNo();
	}
}