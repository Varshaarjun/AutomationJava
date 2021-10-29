package normalpgm;

public class swichcase {

	public static void switchcase1()
	{
		int num1=10;
		int num2=5;
		int res;
		char op='/';
		switch(op)
		{
		case '-':
			res=num1-num2;
		System.out.println("num1-num2="+res);
		break;
		
		case '+':
			res=num1+num2;
		System.out.println("num1+num2="+res);
		break;
		
		case '/':
			res=num1/num2;
		System.out.println("num1/num2="+res);
		break;
		
		default:
			//res=num1-num2;
		System.out.println("unknown operation");
		break;
		}
		System.out.println("pgm ends here");

	}
	public static void main(String[]args)
	{
		swichcase.switchcase1();
	}
}
