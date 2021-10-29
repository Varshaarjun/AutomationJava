
public class method2 {
	private static int add(int a,int b)
	{
		return a+b;
	}
	public  static int mul(int a,int b)
	{
		return a*b;
	}
	protected static int div(int a,int b)
	{
		return a/b;
	}

	protected static int sub(int a,int b)
	{
		return a-b;
	}
	protected static int average(int a,int b)
	{
		return (a-b)/2;
	}
	public static void main(String[] args) {
		
		System.out.println("addition   :"+method2.add(40,10));
		System.out.println("multiplication   :"+method2.mul(40,10));
		System.out.println("division   :"+method2.div(40,10));
		System.out.println("substraction    :"+method2.sub(40,10));
		System.out.println("average    :"+method2.average(40,10));
   }
}
