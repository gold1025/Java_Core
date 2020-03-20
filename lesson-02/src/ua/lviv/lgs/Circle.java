package ua.lviv.lgs;

public class Circle {

	private double radius;
	private double diameter;
	private double area;
	private double length;
	private double PI;
	
	Circle (double radius){
		this.radius = radius;
		this.diameter = radius*2;
		this.PI = 3.14;
		this.length = 2*PI*radius;
		this.area = PI*diameter*diameter/4;
		
	}
	public String toString() {
		return "Площа кола = " + area + "; Довжина кола = " + length + ".";
	}
}
