package oop;

public class Constructor {
	private String color;
	private int borderWidth;

	public Constructor() { // default constructor
		System.out.println("default");
	}

	public Constructor(String c, int bW) { // parameterized constructor
		this.color = c;
		this.borderWidth = bW;
	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public static void main(String[] args) {
		Constructor s = new Constructor("orange", 6);
		System.out.println("color s =" + s.getColor());
		System.out.println("borderWidth s =" + s.getBorderWidth());
	}

}
