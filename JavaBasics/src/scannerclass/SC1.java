package scannerclass;

import java.util.Scanner;

public class SC1 {

	public static void main(String[] args) {
		//String s="hello this is basic java";
		//Scanner scan=new Scanner(s);
		//System.out.println("boolean result:"+scan.hasNext());
		//System.out.println("string:"+scan.nextLine());
	//	scan.close();
		System.out.println(".................enter ur details........");
		Scanner in=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=in.next();
		System.out.println("name:"+name);
		System.out.println("enter ur age");
		int i=in.nextInt();
		System.out.println("age:"+i);
		System.out.println("enter ur salary");
		double d=in.nextDouble();
		System.out.println("salary:"+d);
		in.close();
	}
}
		
		
		
	


