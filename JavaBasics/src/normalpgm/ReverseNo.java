package normalpgm;

public class ReverseNo {
	
		  
	
	/**
	 * num1=12345; reverse=54321
	 * 	rem=num1%10
	 *	rev=rev*10+rem
	 *	num1=num1/10;
	 * 
	 * palindrome: num1=121; reverse=121
	 */
	static void reverseNumber(int num) {
		int rev=0;
		System.out.println("Actual Number: "+num);
        while(num!=0) {
	      int rem=num%10;
	      rev=rev*10+rem;
		  num=num/10;
	}
		//for(;num!=0;num=num/10) {
		//	int rem=num%10;
		//	rev=rev*10+rem;
	//	}
		System.out.println("Reverse Number: "+rev);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Palindrome.reverseNumber(123);
		ReverseNo.reverseNumber(12345);
	}
}
