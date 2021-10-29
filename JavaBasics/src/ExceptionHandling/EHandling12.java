package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class EHandling12 {

// defining a method
	public static int divideNum(int m, int n)
	{
		int div = m / n;
		return div;
	}
	static void waitFor(long k) throws InterruptedException {
		Thread.sleep(k);
		System.out.println("I am done with waiting..");
	}

	// main method
	public static void main(String[] args) throws InterruptedException {
		EHandling12 obj = new EHandling12();
		try {
		System.out.println(obj.divideNum(45, 0));
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		waitFor(5000);
		System.out.println("Rest of the code..");
	}
}