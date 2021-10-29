package Systemclass;

public class SystemDemo {

	public static void main(String args[]) {
		//checking specific property
		System.out.println("system user dir:"+System.getProperty("user.home"));
		System.out.println("current workin dir:"+System.getProperty("user.dir"));
		//clearing this property
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));//null
		//setting specific property
		System.setProperty("user.country", "IND");
		//checking property
		System.out.println(System.getProperty("user.country"));//IND
		//checking property other thn system property
		//illustarting getproperty(String key,String def)
		System.out.println("other than system property:"+System.getProperty("user.password","none of ur business"));
		System.out.println("diff betwn the current time and mid night,jan 1,1970 UTC is"+System.currentTimeMillis());
		System.out.println("current time in "+"nano sec:"+System.nanoTime());
	}
}



