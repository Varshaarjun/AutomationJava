package constructor;
  class C{
	  double i=10.23;
	  C(double j){
		  System.out.println("running class c constructor");
		  i=j;
	  }
  }
  
	  
public class cons6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(" main() of class cons6 is started");
		 C b1=new C(15.34);
		 System.out.println("class c global variable i="+b1.i);
		 
		 C b2=new C(45.34);
		 System.out.println("class c global variable i="+b2.i);
		// C b1=new C(15.34);
		 System.out.println("main() of class cons6 ends here");
	}

}
