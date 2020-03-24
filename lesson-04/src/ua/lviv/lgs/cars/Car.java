package ua.lviv.lgs.cars;

public class Car {
	private String brand;
	private int createYear;
	private Wheel wheel;
	private Kermo kermo;
	private Body body;
	public Car(String brand, int createYear, Wheel wheel, Kermo kermo, Body body) {
		super();
		this.brand = brand;
		this.createYear = createYear;
		this.wheel = wheel;
		this.kermo = kermo;
		this.body = body;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getCreateYear() {
		return createYear;
	}

	public void setCreateYear(int createYear) {
		this.createYear = createYear;
	}
	
	public Wheel getWheel() {
		return wheel;
	}
	
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Kermo getKermo() {
		return kermo;
	}
	
	public void setKermo(Kermo kermo) {
		this.kermo = kermo;
	}
	
	public Body getBody() {
		return body;
	}
	
	public void setBody(Body body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return "Car [brand= " + brand + ", createYear= " + createYear + ", wheel= " + wheel + ", kermo= " + kermo
				+ ", body= " + body + "]";
	}

	public void changes1() {
		wheel.changesize();
		wheel.changeseason("autmn");
	}
	public void changes2() {
		kermo.newmaterial("rubber");
		kermo.changediameter();
	}
	public void changes3() {
			body.changehigh();
			body.newcolor("black");
	}
	public void newbrand() {
		this.brand = "Audi";
	}
	public void old() {
		this.createYear = createYear-20;
	}
	

}
