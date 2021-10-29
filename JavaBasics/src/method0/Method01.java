package method0;

public class Method01 {
	 public static void addition(int a,int b)
	{
	int result=a+b;
	System.out.println("enter the  two numbers for addition:");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	
	System.out.println("result of addition is:"+result);

	}
	static void multiplication(int a,int b)
	{
	int result=a*b;
	System.out.println("enter the  two numbers for multiplication:");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	
	System.out.println("result of multiplication is:"+result);

	}
	 static void substraction(int a,int b) 
	{
		int result=a-b;
		System.out.println("enter the  two numbers for substraction:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		System.out.println("result of substraction is:"+result);
	
	}
	 private static void division(int a,int b) 
		{
			int result=a/b;
			System.out.println("enter the  two numbers for division:");
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			
			System.out.println("result of division is:"+result);
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Method01.addition(100, 200);
		 Method01.addition(10, 20);
         Method01.multiplication(10, 20);
         Method01.substraction(50,10);
         Method01.division(500,10);
	}

}
