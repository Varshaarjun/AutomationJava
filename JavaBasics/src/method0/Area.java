package method0;

public class Area {
	
		 public static void circle(double pi,int radius)
		   {
			   double result=pi*radius*radius;
		       System.out.println("Radius of circle is :"+radius);
	     	   	System.out.println("Area of circle is:"+result);
           }
		 
		static void triangle(double height,double base)
	          {
	           double area=0.5*base*height;
		
		        System.out.println("height of triangle is:"+height);
		        System.out.println("base of triangle is:"+base);
		
		        System.out.println("Area of triangle is:"+area);

		      }
         static void rectangle(int l,int b) 
		     {
			   int area=l*b;
		
		         System.out.println("length of rectangle is:"+l);
		         System.out.println("bredth of rectangle is:"+b);
			
	           	System.out.println("Area of rectangle is:"+area);
		
		     }
		 private static void square(int a,int b) 
		    {
		    	 int area=a*b;
			
				System.out.println("1st side of square is:"+a);
				System.out.println("2nd side of square is:"+b);
					
				System.out.println("Area of square is:"+area);
		    }
			
		public static void main(String[] args)
		  {
			 Area.circle(3.14, 2);
		     Area.triangle(10, 20);
	         Area.rectangle(50, 50);
	         Area.square(10, 10);
	      }
      }
	
