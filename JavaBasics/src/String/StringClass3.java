package String;

public class StringClass3 {

	public static void main(String[] args) {
		String s1="i am from nashik";
		String[] strArray=s1.split("");
		for(String s:strArray)
		{
			System.out.println(s);
		}
		System.out.println("************");
		String s2="i am from mumbai";
		System.out.println("actual string:"+s2);
		String[] strArray2=s2.split(" ",3);
		for(String s:strArray2)
		{
			System.out.println(s);
		}
		System.out.println("******************");
		String s3="i am from pune";
		System.out.println("actual string:"+s3);
		String[] strArray3=s3.split(" ");
		String temp="";
		for(String s:strArray3)
		{
			System.out.println(s);
		}
		for(int i=strArray3.length-1;i>=0;i--)
		{
			temp=temp+" "+strArray3[i];
		}
		System.out.println(temp.trim());
	}
}

		
		