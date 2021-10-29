package blockassignments;

public class block6 {

	block6()
	{
		this(10);
		System.out.println("zero param cons");
		
	}block6(int i)
	{
		System.out.println("int param cons");
	}
	
	static {
		System.out.println("running static block1 of class block6");
	}
	{
		System.out.println("running non static block1 of class block6");
	}
	public static void main(String[] args) {
		System.out.println("main() starts");
		block6 b2=new block6();
		System.out.println("............................");
		
		System.out.println("main() ends");// TODO Auto-generated method stub

	}
static
{
	System.out.println("running static  block2 of class block6");
}
{
	System.out.println("running non static  block2 of class block6");
}
}
