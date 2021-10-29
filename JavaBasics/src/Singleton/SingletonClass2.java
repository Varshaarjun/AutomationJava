package Singleton;
class Demo1223{
	private Demo1223() {
		System.out.println("i m zero para cons");
	}
	static Demo1223 d1=new Demo1223();
	String name="pune";
	static Demo1223 getInstance()
	{
		return d1;
	}
	void print() {
		System.out.println("i am print of singleton class Demo1223");
		
	}
}
public class SingletonClass2 {

	public static void main(String[] args) {
		Demo1223 d1=Demo1223.getInstance();
		d1.print();
		System.out.println(d1.name);//pune
		d1.name="banglore";
		System.out.println("d1 ref:"+d1.name);
		Demo1223 d2=Demo1223.getInstance();
		System.out.println("d2 ref:"+d2.name);

	}

}
