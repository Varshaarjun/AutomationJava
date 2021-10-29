package method0;

public class Method02 {
	static int x=10,y=20,z=30;

	public static void main(String[] args) {
		
System.out.println("input the first no:   "+x);
System.out.println("input the second no:  "+y);
System.out.println("input the third no:   "+z);

double res=Method02.average(5,4,4);
System.out.println("average:"+res);
System.out.println("new average:"+average(12,15,17));
System.out.println("new average:"+average(22,55,18));
System.out.println("new average:"+average(15,15,17));
     int p=55,q=58,r=82;
     System.out.println("new average2:"+average(p,q,r));

	}
	public static double average(int a,int b,int c)
	{
		return(x+y+z)/3;
	}
	//public static double addition(long a,int b)
	//{
		
	//}

}
