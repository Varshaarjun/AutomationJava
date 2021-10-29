package method0;

public class Celcius {
    static void celciusConv(float fahrenheit)
    {
    	float celcius=((fahrenheit-32)*5)/9;
    	//float fahrenheit=49;
    	//System.out.println("enter the value of fahrenheit:"+fahrenheit);
    	System.out.println("Temperature in celcius is:"+celcius);
    }
	public static void main(String[] args)
	{
		Celcius.celciusConv(49);

	}

}
