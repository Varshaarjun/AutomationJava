package Collection;

import java.util.Vector;

public class VectorExample {
public static void main(String args[]) {
	//create vector
	Vector<String> vec=new Vector<String>();
	//adding elements using add() method of list
	vec.add("tiger");
	vec.add("lion");
	vec.add("dog");
	vec.add("elephant");
	System.out.println("vector size:"+vec.size());
	System.out.println("vector element"+vec);
	//adding element using addelement() method of vector
	vec.addElement("rat");
	vec.addElement("cat");
	vec.addElement("deer");
	vec.add("elephant");
	System.out.println("elements of vector after adding new elements:"+vec);
	}
}