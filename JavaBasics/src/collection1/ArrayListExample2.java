package collection1;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[]args) {
		ArrayList al=new ArrayList();
		System.out.println("Initial list of elements: " + al);
		System.out.println("list of element satus:"+al.isEmpty());
		al.add("ravi");//adding elements
		al.add("vijay");
		al.add("ajay");
		System.out.println("array list:"+al);
		//adding elements at specific position
		al.add(1,"gaurav");
		System.out.println("printing element at specific position:"+al);
		ArrayList al2=new ArrayList();
		al2.add("sonu");
		al2.add("hanumat");
		//adding 2nd list to the first
		System.out.println("list al before adding list al2:"+al);
		al.addAll(al2);
		System.out.println("list al after adding list al2:"+al);
		ArrayList al3=new ArrayList();
		al3.add("john");
		al3.add("rahul");
		System.out.println("Elements of al2: " + al2);
		System.out.println("Elements of al3: " + al3);
		//adding 3rd list to the 2nd at specific position
		al2.addAll(1,al3);
		System.out.println("after adding al3 into al2:"+al2);
	}

}
		
		