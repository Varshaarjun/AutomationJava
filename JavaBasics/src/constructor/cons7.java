package constructor;
class B{
	  double i=10;
	  B(){
		  System.out.println("running class B constructor");
		  i=23;
	  }
}

	  
public class cons7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(" main() of class cons7 is started");
		 B b1=new B();
		 System.out.println("class B global variable i="+b1.i);
		 
		 B b2=new B();
		 System.out.println("class B global variable i="+b2.i);
		
		 System.out.println("main() of class cons6 ends here");
	}

}

