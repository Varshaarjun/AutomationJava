package WrapperClass;

public class UnboxingOperation2 {

	public static void main(String[] args) {
		Double doubleObj=25.2566;//autoboxing
		System.out.println("doubleObj:"+doubleObj);
            ///only boxed obj can be unboxed
		double salary=doubleObj.doubleValue();//unboxing
		System.out.println(salary);
		System.out.println(doubleObj==salary);
	}

}
