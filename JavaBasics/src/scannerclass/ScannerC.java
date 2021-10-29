package scannerclass;

import java.util.Scanner;

public class ScannerC {

	public static void main(String[] args) {
	//	int age=10;
	//	double salary=35000.36;
	//	String name="nashik";
		Scanner SC=new Scanner(System.in);
		int age;
		double salary;
		String name;
		boolean valid;
		System.out.println("get the age value from console");
		age=SC.nextInt();
		System.out.println("get the salary value from console");
		salary=SC.nextDouble();
		System.out.println("get the name value from console");
		name=SC.next();
		System.out.println("enter true/false val from console");
		valid=SC.nextBoolean();
		System.out.println("age  "+age);
		System.out.println("salary  "+salary);
		System.out.println("name   "+name);
		System.out.println("valid   "+valid);
		int num1,num2;
		System.out.println("enter num1:");
		num1=SC.nextInt();
		System.out.println("enter num2");
		num2=SC.nextInt();
		char op;
		System.out.println("enter op");
		op=SC.next().charAt(0);
		System.out.println("addition of two no:"+addNum(op,num1,num2));
		System.out.println(".........................");
	}
	static int addNum(char op,int num1,int num2) {
		if(op=='+') {
			return num1+num2;
		}return 0;
	}
	
}	
		
		
		
		
		
		
