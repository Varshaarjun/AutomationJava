package blockassignments;

public class block4 {

	 block4()
	 {
		 System.out.println("zero param cons");
	 }
	 {
		 System.out.println("running non-static block-1 of class block4..");
	 } 
	 	public static void main(String[] args)
	 	{
		// TODO Auto-generated method stub
	 		System.out.println("main() starts");
	 		block4 b1=new block4();
	 		System.out.println(".........................");
	 		block4 b2=new block4();
	 		System.out.println("main() ends");
	}
	 	{
	 		 System.out.println("running non-static block-2 of class block4..");
	 	}
}
