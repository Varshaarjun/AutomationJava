package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample4 {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("is arraylist empty:"+al.isEmpty());
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");
		//System.out.println("array list:"+al);
		//creating new arraylist
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("ravi");
		al2.add("hanumat");
		//al.addAll(al2);
		//System.out.println("adding ele of al2 list"+al2);
		//System.out.println("updated list:"+al);
		
		al.retainAll(al2);
		System.out.println("iterating the elements after retaining the elements of al2");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}


