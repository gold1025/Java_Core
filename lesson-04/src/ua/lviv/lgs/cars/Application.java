package ua.lviv.lgs.cars;

public class Application {
	public static void main(String[] args) {
		
		Car c = new Car("Volvo", 1995, new Wheel("winter", 25.6), new Kermo(15.5, "lather"), new Body("green", 170)); 
		c.changes1();
		c.changes2();
		c.changes3();
		c.old();
		c.newbrand();
		System.out.println(c);
	}

}
