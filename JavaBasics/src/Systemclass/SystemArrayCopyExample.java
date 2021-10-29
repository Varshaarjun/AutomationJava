package Systemclass;

public class SystemArrayCopyExample {

	public static void main(String[] args) {
		String a[]= {"A", "B","B","B","H","A","M"};//SOURCE ARRAY
	    String b[]= {"S", "H", "U", "N", "U", "L", "L", "J", "A", "D", "O", "N" }; // destination array
	    String src[], dest[];
	    int srcPos, destPos,length;
	    src=a;
	    srcPos=2;
	    dest=b;
	    destPos=3;
	    length=4;
	    System.out.println("source array:");
	    for(int i=0;i<src.length;i++)
	    {
	    	System.out.print(a[i]);
	    }
	    System.out.println();
	    System.out.println("destination array");
	    for(int i=0;i<src.length;i++)
	    {
	    	System.out.print(b[i]);
	    }
	    System.out.println();
	   System.out.println("source position"+srcPos);
	  System.out.println("destination position"+destPos);
	    System.out.println("length"+length);
	    System.arraycopy(src, srcPos, dest, destPos, length);//use of arraycopy() method
		System.out.println("Destination array after use of arraycopy()");
		for(int i=0;i<length;i++)
		{
			System.out.print(b[i]);
		}   
	}
}
				

	
