import java.util.Scanner;

public class Shape {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		calculateArea();
		calculateCircumference();

	}
	
   public static void calculateArea() {
		
	   Rectangle obj1 = new Rectangle();
	   Triangle obj2 = new Triangle();
		
	   System.out.print("Enter Height of Rectangle ");
	   double line1 = input.nextDouble();
	   System.out.print("Enter Width of Rectangle ");
	   double line2 = input.nextDouble();
	   obj1.setHeight(line1);
	   obj1.setWidth(line2);
	   System.out.println("Height is "+obj1.getHeight());
	   System.out.println("Width is "+obj1.getWidth());
	   obj1.Rectangle(line1, line2);
	   
	   
	   System.out.print("Enter Height of Triangle ");
	   double line3 = input.nextDouble();
	   System.out.print("Enter Base of Triangle ");
	   double line4 = input.nextDouble();
	   obj2.setHeight(line3);
	   obj2.setBase(line4);
	   System.out.println("Height is "+obj2.getHeight());
	   System.out.println("Base is "+obj2.getBase());
	   obj2.Triangle(line3, line4);
		
	}

   public static void calculateCircumference() {
		
		Circle obj3 = new Circle();
		System.out.print("Enter Radius of Circle ");
		double cc = input.nextDouble();
		obj3.setRadius(cc);
		System.out.println("Radius is "+obj3.getRadius());
	    obj3.Circle(cc);
	    
	    
	}

}
