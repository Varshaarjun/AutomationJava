package WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		int a=20;
		Integer k=new Integer(a);
		Integer l=new Integer(20);
		Integer j=a;
		System.out.println("a:" +a+ "\nk: "+k+ "\nl: "+l+ "\nj: "+j);
		System.out.println("unboxing of boxed obj");
		Integer a1=new Integer(3);
		int i1=a1.intValue();
		System.out.println("a1: "+a1+"\ni1 "+i1);
		

	}

}
