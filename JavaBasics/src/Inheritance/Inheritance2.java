package Inheritance;



	class A1{
		static int a=10;
		int b=20;
		double c=13.45;
	}

	class B1 extends A1{  //subclass/child class,B1 inherits class A1 non-static member
		static int x=30;
		int y=40;
		double z=53.45;
	}
	class C1 extends B1{  //C1 inherits class B1 inherits claa A1 non static member
		static int p=50;
		int q=60;
		double r=66.45;
	}
	public class Inheritance2 {

		public static void main(String[] args) {
			System.out.println("*******************************");
		//access static member class A members
			System.out.println("class A1 static variable:"+A1.a);
			//access static member class B members
			System.out.println("class B1 static variable:"+B1.x);
			//access static member class C members
			System.out.println("class C1 static variable:"+C1.p);
			
			System.out.println("*******************************");
			//access non static member class A1,B1,C1 members
			C1 c1=new C1();
			
			System.out.println("with class C refer:"+c1.b);
			System.out.println("with class C refer:"+c1.c);
			System.out.println("with class C refer:"+c1.y);
			System.out.println("with class C refer:"+c1.z);
			System.out.println("with class C refer:"+c1.q);
			System.out.println("with class C refer:"+c1.r);
			
			System.out.println("*******************************");
              B1 b1=new B1();
			
			System.out.println("with class B refer:"+b1.b);
			System.out.println("with class B refer:"+b1.c);
			System.out.println("with class B refer:"+b1.y);
			System.out.println("with class B refer:"+b1.z);
			
		}

	}
