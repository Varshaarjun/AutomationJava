package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();//creating arraylist
		l1.add("mango");
		l1.add("apple");
		l1.add("banana");
		l1.add("grapes");
		System.out.println("list count:"+l1.size());
		System.out.println("list elements are:"+l1);
		System.out.println("printing the elements present on position 1:"+l1.get(0));
		System.out.println("traversing list through for loop:");
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("travering list through for each loop:");	
		for(Object fruit:l1) {
			System.out.println(fruit);
		}
		//accessing the element
		System.out.println("returning element:"+l1.get(1));//it return 2nd element,bcz index starts from 0
		//changing element
		l1.set(1, "dates");
		System.out.println("size of list:"+l1.size());
		System.out.println("list elements:"+l1);
		//sorting element
		Collections.sort(l1);//by default it in ascending order  and store it in the same collection
		System.out.println("size of list:"+l1.size());
		System.out.println("elements of list:"+l1);
		System.out.println("traversing list through for each() method:");
		//forEach() method is a new feature introduced in java 8.
		l1.forEach(a -> { //here,we r using lambda expression
			System.out.println(a);
		});
		System.out.println("trvarsing list thruiterator interface ");
		Iterator itr=l1.iterator();
		/**
		 * List element: [Banana, Dates, Grapes, Mango]
		 * Iterator is a Interface in collection, which is used to iterate collection elements
		 * Iterator interface has following method to iterate collection elements
		 * 1. hasNext() ---> boolean --> true next element is present, false no next element
		 * 2. next() ---> Object --> it will return next element from collection
		 * 3. remove() --> void --> element deletion
		 * Iterator object can be use to iterate a collection only once, for 2nd iteration create new Iterator object
		 */		
		System.out.println(itr.hasNext());
//		System.out.println(itr.next());//Banana
//		System.out.println(itr.next());//Dates
//		System.out.println(itr.next());//Grapes
//		System.out.println(itr.next());//Mango
//		System.out.println(itr.next());//NoSuchElementException exception
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());//
		//for 2nd iteration we need to create new instance for Iterator interface
		System.out.println("***************************************");
		Iterator itr2=l1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
	}
  }
}
	
	

