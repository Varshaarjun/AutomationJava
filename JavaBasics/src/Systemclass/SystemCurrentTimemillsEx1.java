package Systemclass;

import java.util.Properties;

public class SystemCurrentTimemillsEx1 {

	public static void main(String[] args) {
		System.out.println("curent tme in milisecond");
		System.out.println(System.currentTimeMillis());
		System.out.println("curent tme in nanoseconds="+System.nanoTime());
		SystemLineSeperatorExample3(); 
	}
		public static void SystemLineSeperatorExample3() {
			//use of Lineseperator
			String a="varsha"+System.lineSeparator()+"jadon";
			System.out.println(a);
		}
		public static void SystemGetPropertyExample7() {
			//here we created property with my name and assigned its default value varshaJadon
		    System.out.println("my name:"+System.getProperty("myname","varsha jadon"));
		}
		 public static void SystemGetPropertyExample6() {
			 System.out.println("ur system propertyfor user");
			 Properties p=System.getProperties();
			 System.out.println(p.getProperty("user.name"));//property to get User's account name  
			 System.out.println(p.getProperty("user.home"));//property to get User's home directory 
			 System.out.println(p.getProperty("user.dir")); //property to get User's current working directory 
		 }
		   public static void SystemIdentityHashCodeExample5() {
			   String a=new String();
			   a.equals("varsha");
			   System.out.println("identity hashcode of object a="+System.identityHashCode(a));
			   String b=new String();
			   b.equals("Jadon");
			   System.out.println("identity hashcode of object b="+System.identityHashCode(b)); 
		   }
		    
  
	

	}


