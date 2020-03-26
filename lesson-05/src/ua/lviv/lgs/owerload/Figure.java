package ua.lviv.lgs.owerload;

public class Figure {
	private int length;
	private int width ;
	private int height ;
	
	public Figure(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	Figure() {
		this( 3,4,5);
	}
	@Override
	public String toString() {
		return "Figure [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	

}
