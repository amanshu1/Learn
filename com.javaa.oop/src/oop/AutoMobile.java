package oop;

public class AutoMobile {
	private String color;
	private int speed;
	private String make;
	public static final int CHANGE_GEAR=6;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void breakk(int breakk) {
		breakk = getSpeed() - breakk;
		setSpeed(breakk);
	}

	public void accelerate(int accelerate) {
		accelerate = getSpeed() + accelerate;
		setSpeed(accelerate);
	}
	public void changeGear(int g) {
		System.out.println("change gear to="+g);
	}

	public static void main(String[] args) {
		AutoMobile am = new AutoMobile();
		am.setMake("Activa");
		System.out.println("auto mobile=" + am.getMake());
		am.setColor("blue");
		System.out.println("color=" + am.getColor());
		am.setSpeed(60);
		System.out.println("speed=" + am.getSpeed());
		am.breakk(10);
		System.out.println("Break="+am.getSpeed());
		am.accelerate(30);
		System.out.println("Accelerate="+am.getSpeed());
		am.changeGear(1);
		System.out.println("no of gear="+AutoMobile.CHANGE_GEAR);
	}
}