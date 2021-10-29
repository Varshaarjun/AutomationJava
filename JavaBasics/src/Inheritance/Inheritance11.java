package Inheritance;

 class Inheritance11 {

	 void reverseNumber(int num) {
	int rev=0;
	System.out.println("Actual Number: "+num);
    while(num!=0) {
      int rem=num%10;
      rev=rev*10+rem;
	  num=num/10;
      }
	System.out.println("Reverse Number: "+rev);
}

 void palinNumber(int num) {
	int rev=0,temp=num;
	System.out.println("Actual Number: "+num);
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(temp==rev) {
		System.out.println("Given number is palindrome");
	}else{
	System.out.println("Given number is not a palindrome");
	}
}
	 void LeapYear()
	{
		int year=2019;
     if(((year % 4 ==0)&&(year % 100 !=0)) || (year % 400 ==0))
         {
	         System.out.println("Given year is a leap year");
        }
      else
        {
	            System.out.println("Given year is not leap year or is a common year");
         }
	    }
	 void display()
		{
			System.out.println("display emp info");
			}
	 void display(int num) {
	 System.out.println("reversenumber of the given no is: " +revno);
	 System.out.println("palindrome number of a given no is: " + PalinNumber);
	 System.out.println("leapyear of the given no is:"+year);
	 }
	/*class Inheritance12 extends  Inheritance11{
		
		
		
		
		static void reverseNumber(int num) {
			int rev=0;
			System.out.println("Actual Number: "+num);
		    while(num!=0) {
		      int rem=num%10;
		      rev=rev*10+rem;
			  num=num/10;
		      }
			System.out.println("Reverse Number: "+rev);
		}

		static void palinNumber(int num) {
			int rev=0,temp=num;
			System.out.println("Actual Number: "+num);
			while(num!=0) {
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if(temp==rev) {
				System.out.println("Given number is palindrome");
			}else{
			System.out.println("Given number is not a palindrome");
			}
		}
			static void LeapYear()
			{
				int year=2019;
		     if(((year % 4 ==0)&&(year % 100 !=0)) || (year % 400 ==0))
		         {
			         System.out.println("Given year is a leap year");
		        }
		      else
		        {
			            System.out.println("Given year is not leap year or is a common year");
		         }
			    }
	}  */
	public static void main(String[] args) {
		Inheritance11 i1=new Inheritance11();
		Inheritance11 i2=new Inheritance11();
		Inheritance11 i3=new Inheritance11();
		//Inheritance11 i2=new Inheritance11();
		//Inheritance11 i3=new Inheritance11();
		//Inheritance11.palinNumber(121);
		//Inheritance11.LeapYear();
		i1.display(12345);
		i2.display(121);
		i3.display(2000);
		}

}