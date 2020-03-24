package ua.lviv.lgs.cars;

public class Kermo {

	private double diameter;
	private String material;
	
	public Kermo(double diameter, String material) {
		this.diameter = diameter;
		this.material = material;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "diameter= " + diameter + ", material= " + material + " ";
	}
	
	public void newmaterial(String newm) {
		this.material = newm;
	}
	public void changediameter() {
		this.diameter = diameter+0.5;
	}
}
