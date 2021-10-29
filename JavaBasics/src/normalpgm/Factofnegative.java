package normalpgm;

public class Factofnegative {

	

static void factorOfNegative(int number) {
	System.out.println("Factors of"+number+" are:");
	for(int i=number;i<=Math.abs(number);++i) {
		
		if(i==0) {
			continue;
		}else {
			if(number%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
public static void main(String[] args) {
	Factofnegative.factorOfNegative(-20);
}
}
