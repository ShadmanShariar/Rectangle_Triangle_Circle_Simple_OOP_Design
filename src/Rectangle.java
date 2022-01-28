
public class Rectangle extends Shape {

	
	public double height;
	
	public double width;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
    public static void Rectangle (double a, double b) {
		
    	System.out.println("Area of Rectangle is "+(a*b));
		
	}
	
	
}
