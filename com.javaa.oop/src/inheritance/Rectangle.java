package inheritance;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void area() {
		int a = length * width;
		System.out.println("area of rectangle=" + a);
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(5);
		r.setcolor("green");
		r.setBorderWidth(7);
		r.area();
		System.out.println("length=" + r.getLength());
		System.out.println("width=" + r.getWidth());
		System.out.println("color=" + r.getcolor());
		System.out.println("borderWidth=" + r.getBorderWidth());

	}

}
