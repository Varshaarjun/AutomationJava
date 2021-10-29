package blockassignments;

public class block9assignment {
	block9assignment()
	 {
}
	    static int EmpId=05;
	double salary=10000.00;
	     static {
	      System.out.println("running static block1 of class blocks9..");
	          } 
	                               {
	                            System.out.println("running non-static block of class blocks9..");
	                          	   }
	                               void display() {
		                             System.out.println("EmpId:"+EmpId);
		                             System.out.println("salary:"+salary);
	                               }
	                               void display(double salary) {
			                                  System.out.println("salary"+salary);
		                               }
	                                                  public static void main(String[] args) {
		
		                                                 	System.out.println("main() starts");
		                                                 	block9assignment b1=new block9assignment();
		                                                 	 System.out.println("..........................");
		                                        			 b1.display();
		                                        			block9assignment b2=new   block9assignment();
		                                        		
                                                            System.out.println("main() ends");
	                                                }
	                                                  {
	                                          			salary=20000.00;
	                                          		}
	                                                  {
		                                          			EmpId=10;
		                                          		}
	                                                  }