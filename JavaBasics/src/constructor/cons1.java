package constructor;

public class cons1 {
	cons1()
	{
		System.out.println(" this is a zero para cons");
	}
	 cons1( char c)
	{
		
		System.out.println(" this is a single para cons");
	}
	 cons1(int num1,int num2)
	{
		System.out.println(" this is a int-int paramer cons");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("pgm starts   ");
		cons1 c1=new cons1();
		cons1 c2=new cons1('d');
		cons1 c3=new cons1(10,20);
		
	}

}
