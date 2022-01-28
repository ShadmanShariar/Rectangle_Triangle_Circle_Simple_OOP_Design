
public class Triangle extends Shape {

	
	public double height;
	
	public double base;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	
    public static void Triangle (double a, double b) {
		
    	System.out.println("Area of Triangle is "+((a*b)/2));
		
	}
	
}
