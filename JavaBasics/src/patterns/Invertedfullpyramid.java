package patterns;

public class Invertedfullpyramid {

	public static void main(String[] args) {
		int no=8;
		for(int i=0;i<no;i++)
			{
				for(int j=0;j<=i;j++) {
					
					
				System.out.print(" ");
				}
				for(int j=0;j<no-i;j++) 
					{
				
					
						System.out.print("* ");
					}
				
				System.out.println();
			}
			}
			
}
