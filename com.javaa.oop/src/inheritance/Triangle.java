package inheritance;

public class Triangle extends Shape{
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void area() {
		double a=0.5*height*base;
		System.out.println("area of rectangle"+a);
	}
	//main
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.setHeight(12);
		t.setBase(6);
		t.setcolor("lilac");
		t.setBorderWidth(3);
		t.area();
		System.out.println("height="+t.getHeight());
		System.out.println("base="+t.getBase());
		System.out.println("color="+t.getcolor());
		System.out.println("Border Width="+t.getBorderWidth());
	}
}
