package method0;

public class nonstaticexample {
 int a=20;
     int add(int num1,int num2)
 {
	 return num1+num2;
	 
 }

	public static void main(String[] args) {
		 nonstaticexample m1=new nonstaticexample();
		 System.out.println(m1.a);
		 int sum=m1.add(12, 17);
		 System.out.println("sum: "+sum);
		 
	}

}
