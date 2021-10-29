package Inheritance;


class A{
	static int a=10;
	int b=20;
	double c=13.45;
}

class B{
	static int x=30;
	int y=40;
	double z=53.45;
}
class C{
	static int p=50;
	int q=60;
	double r=66.45;
}
public class Inheritance1 {

	public static void main(String[] args) {
		System.out.println("*******************************");
		//access static member class A members
		System.out.println("class A static variable:"+A.a);
		
		//access static member class B members
		System.out.println("class B static variable:"+B.x);
		
		//access static member class C members
		System.out.println("class C static variable:"+C.p);
		
		System.out.println("*******************************");
		   //Access nonstatic member class A 
		A a1=new A();
		
		System.out.println("class A non static variable b:"+a1.b);
		System.out.println("class A non static variable c:"+a1.c);
		
		System.out.println("*******************************");
		   //Access nonstatic member class B  
           B b1=new B();
		
		System.out.println("class B non static variable b:"+b1.y);
		System.out.println("class B non static variable c:"+b1.z);
		System.out.println("*******************************");
		    //Access nonstatic member class c  
		     C c1=new C();
			System.out.println("class C non static variable b:"+c1.q);
			System.out.println("class C non static variable c:"+c1.r);
	}

}
