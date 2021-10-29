package Singleton;
class Singleton{
	private static Singleton single_instance=new Singleton();
	public String s;
	private Singleton() {
		s="Hello i m a string part of singleton class";
	}
	public static Singleton getInstanceOfSingleton() {
		return single_instance;
	}
}

	

public class SingletonClass {

	public static void main(String[] args) {
		Singleton x=Singleton.getInstanceOfSingleton();
		System.out.println("string from x is:"+x.s);
		Singleton y=Singleton.getInstanceOfSingleton();
		System.out.println("string from y is:"+y.s);
		Singleton z=Singleton.getInstanceOfSingleton();
		System.out.println("string from z is:"+z.s);
		
		System.out.println("***********converting to uppercase*************");
		x.s=(x.s).toUpperCase();

		System.out.println("string from xis:"+x.s);
		System.out.println("string from yis:"+y.s);
		System.out.println("string from zis:"+z.s);
		System.out.println("\n");
		System.out.println("***********converting to lowercase*************");
		z.s=(z.s).toLowerCase();

		System.out.println("string from xis:"+x.s);
		System.out.println("string from yis:"+y.s);
		System.out.println("string from zis:"+z.s);
		
	}

}
