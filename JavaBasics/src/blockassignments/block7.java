package blockassignments;

public class block7 {
 static int age=25;
 double salary=15000.57;
 static {
	 age=30;
 }
 {
	 salary=45000.32;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() starts");
		System.out.println("age:"+block7.age);
		System.out.println(".......................");
		block7 b1=new block7();
		System.out.println("salary:" +b1.salary);
	}

}
