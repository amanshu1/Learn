package inheritance;

public class TestShape{
	public static void main(String[] args) {
		Shape s= new Circle(6);
		s.setcolor("red");
		s.setBorderWidth(7);
		s.area();
		System.out.println("color="+s.getcolor());
		System.out.println("borderWidth"+s.getBorderWidth());
	}

}
