package inheritance;

public class Circle extends Shape{
	private int radius;
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	public void area() {
		double a =3.14*radius*radius;
		System.out.println("area of cicle"+a);
	}
	//main method
	public static void main(String[] args) {
		Circle c= new Circle();
		c.setRadius(2);
		c.setcolor("blue");
		c.setBorderWidth(10);
		c.area();
		System.out.println("radius="+c.getRadius());
		System.out.println("color="+c.getcolor());
		System.out.println("borderWidth="+c.getBorderWidth());
	}
	

}
