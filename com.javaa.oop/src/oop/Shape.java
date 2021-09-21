package oop;

public class Shape {
	//variables
	private String color;
	private int borderWidth;
	public static final double PI=3.14;
	//setter getter
	public void setcolor(String col) {
		color = col;
	}
	public String getcolor() {
		return color;	
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public static void main(String[] args) {
		Shape s =new Shape();
		s.setcolor("red");
		s.setBorderWidth(6);
		System.out.println("color s ="+s.getcolor());
		System.out.println("Borderwidth=" +s.getBorderWidth());
		//next input s1
		Shape s1 = new Shape();
		s1.setcolor("blue");
		s1.setBorderWidth(5);
		System.out.println("color s1="+s1.getcolor());
		System.out.println("BorderWidth=" +s1.getBorderWidth());
		//next input s2
		Shape s2 = new Shape();
		s2.setcolor("green");
		s2.setBorderWidth(4);
		System.out.println("color s2="+s2.getcolor());
		System.out.println("BorderWidth=" + s2.getBorderWidth());
	}
}
