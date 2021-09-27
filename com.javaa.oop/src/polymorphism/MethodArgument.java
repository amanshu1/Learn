package polymorphism;

public class MethodArgument extends Shape{
	public static void main(String[] args) {
		Shape s[] = new Shape[3];
		s[0] = new Rectangle(1, 2);
		s[1] = new Circle(3);
		s[2] = new Triangle(4, 5);
		double totalArea= calcArea(s);
		System.out.println(totalArea);
	}
	public static double calcArea(Shape[] s) {
		double totalArea = 0;
		for(int i=0;i<s.length;i++) {
			totalArea += s[i].area();
		}
		return totalArea;
	}
	
}
