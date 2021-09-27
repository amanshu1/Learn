package polymorphism;

public class Array extends Shape{
	public static void main(String[] args) {
		Shape s[]=new Shape[3];
		s[0]=new Rectangle(1,2);
		s[1]=new Circle(3);
		s[2]=new Triangle(4,5);
		s[0].area();
		s[1].area();
		s[2].area();
		}

}
