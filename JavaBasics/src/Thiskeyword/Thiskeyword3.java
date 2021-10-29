package Thiskeyword;


class student102{
	int rollno;
	float fee;
	student102(int rollno){
		this.rollno=rollno;
	}
	student102(int rollno,float fee)
	{
		this(rollno);
		this.fee=fee;
	}
	
	void display()
	{
		System.out.println(rollno+"  "+fee);
	}
	
}
public class Thiskeyword3 {

	public static void main(String[] args) {
		
student102 s1=new student102(111);
//System.out.println(s1.rollno+" "+s1.fee);

student102 s2=new student102(112,6000f);
//System.out.println(s2.rollno+" "+s2.fee);

s1.display();
s2.display();
	}

}


