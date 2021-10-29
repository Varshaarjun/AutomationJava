package blockassignments;

public class block3 {
	block3()
	{
		 System.out.println("zero param cons...");
	}
	{
	
		   System.out.println("running non-static block of class blocks3..");
	   }
		public static void main(String[] args) {
			 System.out.println("main() Starts");
			 block3 b1=new block3();
			 System.out.println("..........................");
			 
			 block3 b2=new block3();
			// System.out.println("i am main() of bolcks2 class");
			 System.out.println("main() ends");
		} 
}