package blockassignments;

public class blockassignment2 {
 int a,b,res;
 static int p,q,r,re;
 static {
	 System.out.println("pgm start here");
	 
 }
 {
	 System.out.println("substraction of s-t");
	 
 }
 void sub()
 {
	// int s=10,t=5,sub;
	 System.out.println("sub ");
 }
 static int add(int p,int q)
 {
	 re=p+q;
	 System.out.println("addition of two numbers:"+re);
	 return re;
	 
 }
 static int add(int p,int q,int r)
 {
	 re=p+q+r;
	 System.out.println("addition of three numbers:"+re);
	 return re;
	 
 }
	public static void main(String[] args) {
		blockassignment2 ob=new blockassignment2();
		ob.sub();
		blockassignment2.add(20,20);
		blockassignment2.add(10,20,30);
	}

}
