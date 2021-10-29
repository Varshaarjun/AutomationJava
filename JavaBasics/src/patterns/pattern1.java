package patterns;

public class pattern1 {
//print half pyramid
	/*public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}System.out.println();
		}

	}

}
*/
	public static void halfpyramid() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}System.out.println();
		}

	}


public static void main(String[] args) 
{
	pattern1.halfpyramid();
}
}