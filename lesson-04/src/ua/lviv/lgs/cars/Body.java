package ua.lviv.lgs.cars;

public class Body {
	
	private String color;
	private int high;
	
	public Body(String color, int high) {
		this.color = color;
		this.high = high;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	@Override
	public String toString() {
		return "color= " + color + ", high= " + high + " ";
	}
	public void newcolor(String newc) {
		this.color = newc;
	}
	public void changehigh() {
		this.high = high-10;
	}
}
