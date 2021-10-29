package constructor;

class multiply {
	multiply(){
		 System.out.println("zero para cons");
	}
	void mul(int a,int b) {
		 System.out.println("mul of two="+(a*b));
	}
	void mul(int a,int b,int c) {
		 System.out.println("mul of three="+(a*b*c));
	}
}
		
		  
			  
		public class cons8 {

			public static void main(String[] args) {
				multiply m=new multiply();
				m.mul(6, 10);
				m.mul(10, 6,5);
			}
		}
				
	