package collection1;

import java.util.ArrayList;

public class ArrayListExample3 {
public static void main(String[] args) {
	//generic type collection, which can store only Integer class() object
	ArrayList<Integer> al5=new ArrayList<Integer>();
	//generic type collection, which can store only String class object
	ArrayList<String> al=new ArrayList<String>();
	al.add("ravi");
	al.add("vijay");
	al.add("ajay");
	al.add("anuj");
	al.add("gaurav");
	System.out.println("count:"+al.size());
	System.out.println("list eleemnt:"+al);
	// Removing specific element from arraylist
	System.out.println("remove vijay from collection:"+al.remove("vijay"));
	System.out.println("after invoking remove(object) method:"+al);
	// Removing element on the basis of specific position
	System.out.println("remove index 0 from collection:"+al.remove(0));
	System.out.println("after invoking remove(index) method:"+al);
	System.out.println("***********************************************");
	// Creating another arraylist
	ArrayList<String> al2=new ArrayList<String>();
	al2.add("ravi");
	al2.add("hanumat");
	al.addAll(al2);//adding new ele to arraylist
	System.out.println("updated list:" +al);
	al.removeAll(al2);// Removing all the new elements from arraylist
	System.out.println("after invoking removeall() method:"+al);
	// Removing elements on the basis of specified condition
	al.removeIf(str ->str.contains("ajay"));// Here, we are using Lambda expression
	System.out.println("After invoking removeIf() method: " + al);
	// Removing all the elements available in the list
			al.clear();
			System.out.println("After invoking clear() method: " + al.isEmpty());
}
}
		