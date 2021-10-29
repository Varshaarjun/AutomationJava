package basicspgm;

public class basic1 {
	
	public int addition(int a,int b) 
	{
		int result=a+b;
		System.out.println("addition of two no="+result);
		return result;
	}
	
	
	
	public static void main(String[] args)
	{
		//int x=20;
		// y=40;
		//int result1=x+y;
		//System.out.println("addition of x+y="+result);
		
		basic1 b1=new basic1();
		b1.addition(20, 30);
		//basic1.addition(20,20);
		//basic1.addition(30,20);
		
}
}