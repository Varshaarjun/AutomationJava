package patterns;

public class fullpyramid {

	public static void main(String[] args) {
		int no=8;
		for(int i=0;i<no;i++)
			{
				for(int j=no-i;j>1;j--) {
					
					
				System.out.print(" ");
				}
				for(int j=0;j<=i;j++) 
					{
				
					
						System.out.print("* ");
					}
				
				System.out.println();
			}
			}
			
}

