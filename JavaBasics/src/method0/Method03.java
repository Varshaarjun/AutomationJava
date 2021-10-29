package method0;

public class Method03 {
       int age;
       void display()
       {
       System.out.println(" i am display of method03 class and age value is"+age);
       }

void display(int a)
{
	age=a;
	 System.out.println(" i am display(int ) of method03 class and age value is"+age);
}
       
	public static void main(String[] args) {
		
Method03 m2=new Method03();
System.out.println("age:"+m2.age);
    m2.display();
    m2.display(25);
    System.out.println(" age:"+m2.age);
    Method03 m3=new Method03();
    m3.display();
    m3.display(75);
    System.out.println("age:"+m3.age);
   }
}