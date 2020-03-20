package ua.lviv.lgs;

public class Rectangle {

	private int width;
	private int length;
	private int area;
	private int perimeter;
	
	Rectangle (){
		this.width = 7;
		this.length = 14;
		this.perimeter = width*2+length*2;
		this.area = width*length;
	}
	Rectangle (int width, int length){
		this.width = width;
		this.length = length;
		this.perimeter = width*2+length*2;
		this.area = width*length;
	
	}
	public String toString() {
		return "Периметр прямокутника = " + perimeter + "; Площа прямокутника = " + area + ".";
	}
}