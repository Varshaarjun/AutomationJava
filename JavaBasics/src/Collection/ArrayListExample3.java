package Collection;

import java.util.ArrayList;

public class ArrayListExample3{
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");
		al.add("anuj");
		al.add("gaurav");
		System.out.println("array count:"+al.size());
		System.out.println("array list names:"+al);
		System.out.println("array list names:"+al.get(1));
		// Removing specific element from arraylist
		System.out.println("removing vijay from collection:"+al.remove("vijay"));
		System.out.println("after invoking remove(object) method:"+al);
		// Removing element on the basis of specific position
		System.out.println("remove index zero from collection:"+al.remove(0));
		System.out.println("after invoking remove index method:"+al);
		System.out.println("*************************************");
		// Creating another Arraylist
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("ravi");
		al2.add("Hanumat");
		// Adding new elements to first Arraylist
		al.addAll(al2);
		System.out.println("updated list:"+al);
		// Removing all the new elements from Arraylist
		al.removeAll(al2);
		System.out.println("after invoking removeall() method:"+al);
		// Removing elements on the basis of specified condition
		al.removeIf(str -> str.contains("ajay"));// Here, we are using Lambda expression
		System.out.println("after invoking removeif() method:"+al);
		// Removing all the elements available in the list
			al.clear();
			System.out.println("After invoking clear() method: " + al);
	}
}
