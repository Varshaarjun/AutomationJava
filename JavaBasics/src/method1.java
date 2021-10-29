class call
{
	public static void main(String[] args)
	{
		System.out.println("hiiiiiiiiiiii");	
	}
}
public class method1 {
	
	static double salary=10000.67;
	static int empID=1001;
	public static int printEmpID()
	{
		
		return 1011;
	}
	
     public static void printEmpSal() 
            {
	         return ;
            }
	public static void main(String[] args) {
		int age=30;
		System.out.println("age:"+age);
		System.out.println("salary:"+method1.salary);
		System.out.println("empID:"+method1.empID);
		printEmpSal();
		printEmpID();
	}

}
